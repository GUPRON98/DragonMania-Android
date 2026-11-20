package javax.microedition.lcdui;

import android.graphics.Bitmap;

public abstract class Canvas extends Displayable {
    public static final int UP = 1;
    public static final int DOWN = 6;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int FIRE = 8;
    public static final int GAME_A = 9;
    public static final int GAME_B = 10;
    public static final int GAME_C = 11;
    public static final int GAME_D = 12;

    public static final int KEY_NUM0 = 48;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;

    public static volatile Canvas currentInstance;

    // Double buffering for Android SurfaceView
    private Image backBufferImage;
    private Graphics bufferGraphics;
    private Bitmap frontBitmap;
    private android.graphics.Canvas frontCanvas;

    public static volatile Bitmap displayBitmap;
    public static volatile boolean frameReady = false;
    public static final Object renderLock = new Object();

    public Canvas() {
        currentInstance = this;
        try {
            backBufferImage = Image.createImage(800, 480);
            bufferGraphics = backBufferImage.getGraphics();
            frontBitmap = Bitmap.createBitmap(800, 480, Bitmap.Config.ARGB_8888);
            frontCanvas = new android.graphics.Canvas(frontBitmap);
            displayBitmap = frontBitmap;
        } catch (Throwable ignored) {}
    }

    public int getWidth() {
        return 800;
    }

    public int getHeight() {
        return 480;
    }

    public boolean hasPointerEvents() {
        return true;
    }

    public boolean hasPointerMotionEvents() {
        return true;
    }

    public void setFullScreenMode(boolean mode) {}

    public void repaint() {
        serviceRepaints();
    }

    public void repaint(int x, int y, int width, int height) {
        serviceRepaints();
    }

    public void serviceRepaints() {
        if (bufferGraphics != null) {
            paint(bufferGraphics);
            synchronized (renderLock) {
                if (backBufferImage != null && frontCanvas != null) {
                    Bitmap bmp = backBufferImage.getBitmap();
                    if (bmp != null) {
                        frontCanvas.drawBitmap(bmp, 0, 0, null);
                        displayBitmap = frontBitmap;
                        frameReady = true;
                    }
                }
            }
        }
    }

    public abstract void paint(Graphics g);

    public void keyPressed(int keyCode) {}
    public void keyReleased(int keyCode) {}
    public void keyRepeated(int keyCode) {}

    public void pointerPressed(int x, int y) {}
    public void pointerReleased(int x, int y) {}
    public void pointerDragged(int x, int y) {}

    public int getGameAction(int keyCode) {
        switch (keyCode) {
            case 50: return UP;
            case 56: return DOWN;
            case 52: return LEFT;
            case 54: return RIGHT;
            case 53: return FIRE;
            default: return 0;
        }
    }

    public int getKeyCode(int gameAction) {
        switch (gameAction) {
            case UP: return 50;
            case DOWN: return 56;
            case LEFT: return 52;
            case RIGHT: return 54;
            case FIRE: return 53;
            default: return 0;
        }
    }
}
