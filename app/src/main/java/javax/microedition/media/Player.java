package javax.microedition.media;

import android.media.MediaPlayer;
import javax.microedition.lcdui.ResourceLoader;
import javax.microedition.media.control.Control;
import javax.microedition.media.control.VolumeControl;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Player implements VolumeControl {
    private byte[] data;
    private int volume = 100;
    private int loopCount = 1;
    private ArrayList<PlayerListener> listeners = new ArrayList<>();

    private static MediaPlayer activeMp;
    private static Player activeOwner;
    private static File tempMidiFile;

    public Player(InputStream is, String type) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[4096];
            int read;
            while ((read = is.read(buf)) != -1) {
                baos.write(buf, 0, read);
            }
            this.data = baos.toByteArray();
            is.close();
        } catch (Exception ignored) {
            this.data = new byte[0];
        }
    }

    public void realize() {}
    public void prefetch() {}

    public synchronized void deallocate() {
        stop();
    }

    public synchronized void start() {
        if (data == null || data.length == 0) return;
        try {
            stopActive();

            File cacheDir = ResourceLoader.appContext != null ? 
                ResourceLoader.appContext.getCacheDir() : 
                new File("/data/data/com.gameloft.dragonmania/cache");
            cacheDir.mkdirs();
            if (tempMidiFile == null) {
                tempMidiFile = new File(cacheDir, "current_audio.mid");
            }
            FileOutputStream fos = new FileOutputStream(tempMidiFile);
            fos.write(data);
            fos.close();

            activeMp = new MediaPlayer();
            activeMp.setDataSource(tempMidiFile.getAbsolutePath());
            activeMp.setLooping(loopCount != 1);
            float vol = volume / 100f;
            activeMp.setVolume(vol, vol);
            activeMp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Player p = activeOwner;
                    if (p != null) {
                        for (PlayerListener l : p.listeners) {
                            l.playerUpdate(p, PlayerListener.END_OF_MEDIA, null);
                        }
                    }
                }
            });
            activeMp.prepare();
            activeMp.start();
            activeOwner = this;

            for (PlayerListener l : listeners) {
                l.playerUpdate(this, PlayerListener.STARTED, null);
            }
        } catch (Exception ignored) {}
    }

    public synchronized void stop() {
        if (activeOwner == this && activeMp != null) {
            try {
                activeMp.stop();
                for (PlayerListener l : listeners) {
                    l.playerUpdate(this, PlayerListener.STOPPED, null);
                }
            } catch (Exception ignored) {}
            stopActive();
        }
    }

    private static synchronized void stopActive() {
        if (activeMp != null) {
            try {
                activeMp.stop();
            } catch (Exception ignored) {}
            try {
                activeMp.release();
            } catch (Exception ignored) {}
            activeMp = null;
            activeOwner = null;
        }
    }

    public synchronized void close() {
        if (activeOwner == this) {
            stopActive();
        }
        data = null;
        listeners.clear();
    }

    public void setLoopCount(int count) {
        this.loopCount = count;
        if (activeOwner == this && activeMp != null) {
            try {
                activeMp.setLooping(count != 1);
            } catch (Exception ignored) {}
        }
    }

    public void addPlayerListener(PlayerListener listener) {
        if (listener != null && !listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public Control getControl(String controlType) {
        if ("VolumeControl".equals(controlType)) {
            return this;
        }
        return null;
    }

    // VolumeControl implementation
    @Override
    public int getLevel() {
        return volume;
    }

    @Override
    public int setLevel(int level) {
        this.volume = level;
        if (activeOwner == this && activeMp != null) {
            float vol = level / 100f;
            try {
                activeMp.setVolume(vol, vol);
            } catch (Exception ignored) {}
        }
        return volume;
    }

    @Override
    public boolean isMuted() {
        return volume == 0;
    }

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            if (activeOwner == this && activeMp != null) {
                try {
                    activeMp.setVolume(0, 0);
                } catch (Exception ignored) {}
            }
        } else {
            setLevel(volume);
        }
    }
}
