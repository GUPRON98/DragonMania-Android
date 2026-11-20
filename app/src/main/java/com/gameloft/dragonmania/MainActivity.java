package com.gameloft.dragonmania;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import javax.microedition.lcdui.ResourceLoader;

public class MainActivity extends Activity {
    private static final String TAG = "DragonMania";
    private GameView gameView;
    private javax.microedition.midlet.MIDlet midlet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fullscreen & Keep Screen On
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Edge-to-edge support across notches / display cutouts
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            getWindow().getAttributes().layoutInDisplayCutoutMode =
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        }

        hideSystemUI();

        ResourceLoader.appContext = getApplicationContext();

        // Cleanup any 0-byte corrupted RMS files from previous runs
        try {
            java.io.File rmsDir = new java.io.File(getFilesDir(), "rms");
            if (rmsDir.exists()) {
                java.io.File[] stores = rmsDir.listFiles();
                if (stores != null) {
                    for (java.io.File store : stores) {
                        java.io.File rec1 = new java.io.File(store, "1.rec");
                        if (rec1.exists() && rec1.length() == 0) {
                            rec1.delete();
                        }
                    }
                }
            }
        } catch (Exception ignored) {}

        gameView = new GameView(this);
        setContentView(gameView);

        // Launch Game in background thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i(TAG, "Initializing GloftPDMP...");
                    midlet = (javax.microedition.midlet.MIDlet) Class.forName("GloftPDMP").newInstance();
                    Log.i(TAG, "Starting GloftPDMP.startApp()...");
                    midlet.startApp();
                    Log.i(TAG, "GloftPDMP started successfully.");
                } catch (Throwable t) {
                    Log.e(TAG, "FATAL Exception during game startup", t);
                }
            }
        }, "DragonManiaInitThread").start();
    }

    private void hideSystemUI() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (midlet != null) {
            try {
                midlet.pauseApp();
            } catch (Exception ignored) {}
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideSystemUI();
        if (midlet != null) {
            try {
                midlet.startApp();
            } catch (Exception ignored) {}
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (midlet != null) {
            try {
                midlet.destroyApp(true);
            } catch (Exception ignored) {}
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (javax.microedition.lcdui.Canvas.currentInstance != null) {
            int j2meKey = mapPhysicalKey(keyCode);
            if (j2meKey != 0) {
                javax.microedition.lcdui.Canvas.currentInstance.keyPressed(j2meKey);
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (javax.microedition.lcdui.Canvas.currentInstance != null) {
            int j2meKey = mapPhysicalKey(keyCode);
            if (j2meKey != 0) {
                javax.microedition.lcdui.Canvas.currentInstance.keyReleased(j2meKey);
                return true;
            }
        }
        return super.onKeyUp(keyCode, event);
    }

    private int mapPhysicalKey(int keyCode) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_W:
                return 50; // '2'
            case KeyEvent.KEYCODE_DPAD_DOWN:
            case KeyEvent.KEYCODE_S:
                return 56; // '8'
            case KeyEvent.KEYCODE_DPAD_LEFT:
            case KeyEvent.KEYCODE_A:
                return 52; // '4'
            case KeyEvent.KEYCODE_DPAD_RIGHT:
            case KeyEvent.KEYCODE_D:
                return 54; // '6'
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_ENTER:
            case KeyEvent.KEYCODE_SPACE:
                return 53; // '5'
            case KeyEvent.KEYCODE_BACK:
            case KeyEvent.KEYCODE_ESCAPE:
                return -7; // SoftKey Right
            case KeyEvent.KEYCODE_MENU:
                return -6; // SoftKey Left
            default:
                return 0;
        }
    }

    public static class GameView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
        private SurfaceHolder holder;
        private Thread renderThread;
        private volatile boolean running = false;

        private Paint bitmapPaint;
        private Paint blackPaint;
        private RectF rectGame = new RectF();
        private Vibrator vibrator;

        public GameView(Context context) {
            super(context);
            holder = getHolder();
            holder.addCallback(this);

            bitmapPaint = new Paint();
            bitmapPaint.setFilterBitmap(true);

            blackPaint = new Paint();
            blackPaint.setColor(0xFF000000);

            vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        }

        @Override
        public void surfaceCreated(SurfaceHolder h) {
            running = true;
            renderThread = new Thread(this, "GameRenderThread");
            renderThread.start();
        }

        @Override
        public void surfaceChanged(SurfaceHolder h, int format, int width, int height) {
            layoutScreen(width, height);
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder h) {
            running = false;
            try {
                renderThread.join();
            } catch (Exception ignored) {}
        }

        private void layoutScreen(int w, int h) {
            if (w <= 0 || h <= 0) return;
            // Fill 100% full screen edge-to-edge following user device resolution
            rectGame.set(0, 0, w, h);
        }

        @Override
        public void run() {
            while (running) {
                Canvas c = null;
                try {
                    c = holder.lockCanvas();
                    if (c != null) {
                        renderGame(c);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (c != null) {
                        try {
                            holder.unlockCanvasAndPost(c);
                        } catch (Exception ignored) {}
                    }
                }

                try {
                    Thread.sleep(16); // ~60 FPS
                } catch (InterruptedException ignored) {}
            }
        }

        private void renderGame(Canvas c) {
            c.drawColor(0xFF000000);

            int screenW = getWidth();
            int screenH = getHeight();
            if (rectGame.isEmpty() && screenW > 0 && screenH > 0) {
                layoutScreen(screenW, screenH);
            }

            // Draw game frame from Canvas.displayBitmap
            synchronized (javax.microedition.lcdui.Canvas.renderLock) {
                Bitmap gameBmp = javax.microedition.lcdui.Canvas.displayBitmap;
                if (gameBmp != null) {
                    Rect srcRect = new Rect(0, 0, gameBmp.getWidth(), gameBmp.getHeight());
                    c.drawBitmap(gameBmp, srcRect, rectGame, bitmapPaint);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            javax.microedition.lcdui.Canvas canvas = javax.microedition.lcdui.Canvas.currentInstance;
            if (canvas == null) return true;

            int action = event.getActionMasked();
            float tx = event.getX();
            float ty = event.getY();

            float screenW = getWidth();
            float screenH = getHeight();
            if (screenW <= 0 || screenH <= 0) return true;

            // Dynamically scale 100% full screen touch to 800x480 landscape game coordinates
            float scaleX = screenW / 800f;
            float scaleY = screenH / 480f;

            int gx = (int) (tx / scaleX);
            int gy = (int) (ty / scaleY);

            gx = Math.max(0, Math.min(800, gx));
            gy = Math.max(0, Math.min(480, gy));

            // Samsung TS Lanskap coordinate transform:
            // Game's internal pointerPressed(px, py) rotates via:
            //   gx = py; gy = 480 - px;
            // Therefore, inverse transform to feed into pointerPressed:
            //   px = 480 - gy; py = gx;
            int px = 480 - gy;
            int py = gx;

            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    canvas.pointerPressed(px, py);
                    break;
                case MotionEvent.ACTION_MOVE:
                    canvas.pointerDragged(px, py);
                    break;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    canvas.pointerReleased(px, py);
                    break;
            }

            return true;
        }
    }
}
