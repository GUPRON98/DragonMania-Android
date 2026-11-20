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

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

        // Ensure local save directory exists
        try {
            java.io.File rmsDir = new java.io.File(getFilesDir(), "rms");
            rmsDir.mkdirs();
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

        // Cheat Menu UI elements
        private boolean showCheatModal = false;
        private String cheatNotification = null;
        private long cheatNotificationTime = 0;

        private RectF rectCheatBtn = new RectF();
        private RectF rectCheatModalBox = new RectF();
        private RectF rectCheatGold = new RectF();
        private RectF rectCheatGems = new RectF();
        private RectF rectCheatFood = new RectF();
        private RectF rectCheatLevel = new RectF();
        private RectF rectCheatEnergy = new RectF();
        private RectF rectCheatCooldown = new RectF();
        private RectF rectCheatClose = new RectF();

        // Cheat Paints
        private Paint cheatBtnPaint;
        private Paint cheatBtnBorderPaint;
        private Paint cheatBtnTextPaint;
        private Paint modalBgPaint;
        private Paint modalBoxPaint;
        private Paint modalBorderPaint;
        private Paint modalTitlePaint;
        private Paint modalItemPaint;
        private Paint modalItemBorderPaint;
        private Paint modalItemTextPaint;
        private Paint toastBgPaint;
        private Paint toastTextPaint;

        // Real-Time FPS Tracker
        private int fpsFrameCount = 0;
        private long lastFpsTime = 0;
        private float currentFps = 60.0f;
        private Paint fpsBgPaint;
        private Paint fpsPaint;

        public GameView(Context context) {
            super(context);
            holder = getHolder();
            holder.addCallback(this);

            bitmapPaint = new Paint();
            bitmapPaint.setFilterBitmap(true);

            blackPaint = new Paint();
            blackPaint.setColor(0xFF000000);

            vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

            initCheatPaints();
        }

        private void initCheatPaints() {
            cheatBtnPaint = new Paint();
            cheatBtnPaint.setColor(0x881A2233); // Glassmorphism translucent
            cheatBtnPaint.setStyle(Paint.Style.FILL);

            cheatBtnBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            cheatBtnBorderPaint.setColor(0xFFFFD54F); // Gold trim
            cheatBtnBorderPaint.setStyle(Paint.Style.STROKE);
            cheatBtnBorderPaint.setStrokeWidth(3f);

            cheatBtnTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            cheatBtnTextPaint.setColor(0xFFFFD54F);
            cheatBtnTextPaint.setTextSize(22f);
            cheatBtnTextPaint.setFakeBoldText(true);
            cheatBtnTextPaint.setTextAlign(Paint.Align.CENTER);

            modalBgPaint = new Paint();
            modalBgPaint.setColor(0x99000000); // Dark dimmed backdrop
            modalBgPaint.setStyle(Paint.Style.FILL);

            modalBoxPaint = new Paint();
            modalBoxPaint.setColor(0xF0101622); // Deep navy dragon slate
            modalBoxPaint.setStyle(Paint.Style.FILL);

            modalBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            modalBorderPaint.setColor(0xFFFFB300);
            modalBorderPaint.setStyle(Paint.Style.STROKE);
            modalBorderPaint.setStrokeWidth(4f);

            modalTitlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            modalTitlePaint.setColor(0xFFFFF8E1);
            modalTitlePaint.setTextSize(28f);
            modalTitlePaint.setFakeBoldText(true);
            modalTitlePaint.setTextAlign(Paint.Align.CENTER);

            modalItemPaint = new Paint();
            modalItemPaint.setColor(0xCC202C40);
            modalItemPaint.setStyle(Paint.Style.FILL);

            modalItemBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            modalItemBorderPaint.setColor(0x88FFD54F);
            modalItemBorderPaint.setStyle(Paint.Style.STROKE);
            modalItemBorderPaint.setStrokeWidth(2f);

            modalItemTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            modalItemTextPaint.setColor(0xFFFFFFFF);
            modalItemTextPaint.setTextSize(22f);
            modalItemTextPaint.setFakeBoldText(true);
            modalItemTextPaint.setTextAlign(Paint.Align.CENTER);

            toastBgPaint = new Paint();
            toastBgPaint.setColor(0xEEFF6F00); // Amber glow toast
            toastBgPaint.setStyle(Paint.Style.FILL);

            toastTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            toastTextPaint.setColor(0xFFFFFFFF);
            toastTextPaint.setTextSize(24f);
            toastTextPaint.setFakeBoldText(true);
            toastTextPaint.setTextAlign(Paint.Align.CENTER);

            fpsBgPaint = new Paint();
            fpsBgPaint.setColor(0x99000000);
            fpsBgPaint.setStyle(Paint.Style.FILL);

            fpsPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            fpsPaint.setColor(0xFF00FF66); // Neon Green FPS
            fpsPaint.setTextSize(20f);
            fpsPaint.setFakeBoldText(true);
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

            // Floating Cheat button in bottom center (tengah bawah)
            float btnW = 140f;
            float btnH = 44f;
            float btnX = (w - btnW) / 2f;
            float btnY = h - btnH - 12f;
            rectCheatBtn.set(btnX, btnY, btnX + btnW, btnY + btnH);

            // Layout Cheat Modal
            float modalW = Math.min(w * 0.85f, 560f);
            float modalH = Math.min(h * 0.90f, 440f);
            float modalLeft = (w - modalW) / 2f;
            float modalTop = (h - modalH) / 2f;
            rectCheatModalBox.set(modalLeft, modalTop, modalLeft + modalW, modalTop + modalH);

            float itemH = (modalH - 100f) / 6f;
            float padX = 24f;
            float curY = modalTop + 55f;
            float curW = modalW - padX * 2f;

            rectCheatGold.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 6f); curY += itemH;
            rectCheatGems.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 6f); curY += itemH;
            rectCheatFood.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 6f); curY += itemH;
            rectCheatLevel.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 6f); curY += itemH;
            rectCheatEnergy.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 6f); curY += itemH;
            rectCheatCooldown.set(modalLeft + padX, curY, modalLeft + padX + curW, curY + itemH - 6f); curY += itemH;
            rectCheatClose.set(modalLeft + padX * 2f, modalTop + modalH - 42f, modalLeft + modalW - padX * 2f, modalTop + modalH - 8f);
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

            // 1. Draw game frame from Canvas.displayBitmap (Scaled Full Screen)
            synchronized (javax.microedition.lcdui.Canvas.renderLock) {
                Bitmap gameBmp = javax.microedition.lcdui.Canvas.displayBitmap;
                if (gameBmp != null) {
                    Rect srcRect = new Rect(0, 0, gameBmp.getWidth(), gameBmp.getHeight());
                    c.drawBitmap(gameBmp, srcRect, rectGame, bitmapPaint);
                }
            }

            // 1b. Real-Time FPS Display (Top-Left)
            long now = System.currentTimeMillis();
            fpsFrameCount++;
            if (now - lastFpsTime >= 500) {
                currentFps = (fpsFrameCount * 1000f) / Math.max(1, (now - lastFpsTime));
                fpsFrameCount = 0;
                lastFpsTime = now;
            }
            String fpsStr = String.format("%.1f FPS", currentFps);
            float fpsW = fpsPaint.measureText(fpsStr);
            RectF fpsBadge = new RectF(16f, 16f, 16f + fpsW + 18f, 16f + 30f);
            c.drawRoundRect(fpsBadge, 8f, 8f, fpsBgPaint);
            c.drawText(fpsStr, 25f, 16f + 22f, fpsPaint);

            // 2. Draw Floating ⚡ CHEAT Button (Tengah Bawah)
            c.drawRoundRect(rectCheatBtn, 14f, 14f, cheatBtnPaint);
            c.drawRoundRect(rectCheatBtn, 14f, 14f, cheatBtnBorderPaint);
            c.drawText("⚡ CHEAT", rectCheatBtn.centerX(), rectCheatBtn.centerY() + 7f, cheatBtnTextPaint);

            // 3. Draw Cheat Toast if active
            if (cheatNotification != null && (System.currentTimeMillis() - cheatNotificationTime < 2500)) {
                float toastW = Math.min(screenW * 0.7f, 420f);
                float toastLeft = (screenW - toastW) / 2f;
                RectF toastRect = new RectF(toastLeft, 14f, toastLeft + toastW, 64f);
                c.drawRoundRect(toastRect, 12f, 12f, toastBgPaint);
                c.drawText(cheatNotification, toastRect.centerX(), toastRect.centerY() + 8f, toastTextPaint);
            }

            // 4. Draw Cheat Modal Dialog
            if (showCheatModal) {
                drawCheatModal(c);
            }
        }

        private void drawCheatModal(Canvas c) {
            // Dark Dimmed Background
            c.drawRect(0, 0, getWidth(), getHeight(), modalBgPaint);

            // Modal Card Box
            c.drawRoundRect(rectCheatModalBox, 20f, 20f, modalBoxPaint);
            c.drawRoundRect(rectCheatModalBox, 20f, 20f, modalBorderPaint);

            // Modal Header Title
            c.drawText("⚡ DRAGON MANIA CHEATS ⚡", rectCheatModalBox.centerX(), rectCheatModalBox.top + 38f, modalTitlePaint);

            // Cheat Options
            drawCheatOption(c, rectCheatGold, "💰 +99.999.999 GOLD (COINS)");
            drawCheatOption(c, rectCheatGems, "💎 +99.999.999 GEMS (CASH)");
            drawCheatOption(c, rectCheatFood, "🍎 +99.999.999 MAKANAN NAGA");
            drawCheatOption(c, rectCheatLevel, "👑 MAX LEVEL 40 & MAX XP");
            drawCheatOption(c, rectCheatEnergy, "⚡ MAX ENERGY (100% PULIH)");
            drawCheatOption(c, rectCheatCooldown, "⏳ SKIP SEMUA COOLDOWN / INSTAN");

            // Close Button
            Paint closeBg = new Paint();
            closeBg.setColor(0xCCB71C1C); // Crimson Red
            c.drawRoundRect(rectCheatClose, 10f, 10f, closeBg);
            c.drawText("❌ TUTUP / KEMBALI", rectCheatClose.centerX(), rectCheatClose.centerY() + 7f, modalItemTextPaint);
        }

        private void drawCheatOption(Canvas c, RectF rect, String label) {
            c.drawRoundRect(rect, 10f, 10f, modalItemPaint);
            c.drawRoundRect(rect, 10f, 10f, modalItemBorderPaint);
            c.drawText(label, rect.centerX(), rect.centerY() + 7f, modalItemTextPaint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int action = event.getActionMasked();
            float tx = event.getX();
            float ty = event.getY();

            // Handle Cheat Modal clicks
            if (showCheatModal) {
                if (action == MotionEvent.ACTION_DOWN) {
                    if (rectCheatGold.contains(tx, ty)) {
                        applyCheatGold();
                        triggerVibrate(35);
                        showToast("💰 +99.999.999 GOLD AKTIF!");
                        return true;
                    } else if (rectCheatGems.contains(tx, ty)) {
                        applyCheatGems();
                        triggerVibrate(35);
                        showToast("💎 +99.999.999 GEMS AKTIF!");
                        return true;
                    } else if (rectCheatFood.contains(tx, ty)) {
                        applyCheatFood();
                        triggerVibrate(35);
                        showToast("🍎 +99.999.999 FOOD AKTIF!");
                        return true;
                    } else if (rectCheatLevel.contains(tx, ty)) {
                        applyCheatLevel();
                        triggerVibrate(35);
                        showToast("👑 LEVEL 40 & MAX XP AKTIF!");
                        return true;
                    } else if (rectCheatEnergy.contains(tx, ty)) {
                        applyCheatEnergy();
                        triggerVibrate(35);
                        showToast("⚡ ENERGY PENUH 100%!");
                        return true;
                    } else if (rectCheatCooldown.contains(tx, ty)) {
                        applyCheatCooldown();
                        triggerVibrate(35);
                        showToast("⏳ COOLDOWN SELESAI / INSTAN!");
                        return true;
                    } else if (rectCheatClose.contains(tx, ty) || !rectCheatModalBox.contains(tx, ty)) {
                        showCheatModal = false;
                        triggerVibrate(25);
                        return true;
                    }
                }
                return true;
            }

            // Check Floating Cheat Button click
            if (action == MotionEvent.ACTION_DOWN && rectCheatBtn.contains(tx, ty)) {
                showCheatModal = true;
                triggerVibrate(30);
                return true;
            }

            // Forward to J2ME Touchscreen Canvas
            javax.microedition.lcdui.Canvas canvas = javax.microedition.lcdui.Canvas.currentInstance;
            if (canvas == null) return true;

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

        private void showToast(String msg) {
            cheatNotification = msg;
            cheatNotificationTime = System.currentTimeMillis();
        }

        private void triggerVibrate(long ms) {
            if (vibrator != null) {
                try { vibrator.vibrate(ms); } catch (Exception ignored) {}
            }
        }

        // ==========================================
        // DRAGON MANIA CHEAT ENGINE IMPLEMENTATION
        // ==========================================
        private static int[] getE() {
            try {
                Class<?> clazzT = Class.forName("t");
                Field fieldAb = clazzT.getDeclaredField("ab");
                fieldAb.setAccessible(true);
                Object objAb = fieldAb.get(null);
                if (objAb != null) {
                    Field fieldE = objAb.getClass().getDeclaredField("e");
                    fieldE.setAccessible(true);
                    return (int[]) fieldE.get(objAb);
                }
            } catch (Throwable t) {
                t.printStackTrace();
            }
            return null;
        }

        private static void callTMethod(String name, int val) {
            try {
                Class<?> clazzT = Class.forName("t");
                Method m = clazzT.getMethod(name, int.class);
                m.invoke(null, val);
            } catch (Throwable ignored) {}
        }

        public void applyCheatGold() {
            int[] e = getE();
            if (e != null && e.length > 2) {
                e[1] = 99999999;
                e[2] = 99999999;
                callTMethod("g", 500000);
            } else {
                showToast("Buka Permainan / Save Dahulu!");
            }
        }

        public void applyCheatGems() {
            int[] e = getE();
            if (e != null && e.length > 4) {
                e[3] = 99999999;
                e[4] = 99999999;
                callTMethod("h", 500000);
            } else {
                showToast("Buka Permainan / Save Dahulu!");
            }
        }

        public void applyCheatFood() {
            int[] e = getE();
            if (e != null && e.length > 6) {
                e[5] = 99999999;
                e[6] = 99999999;
                callTMethod("i", 500000);
            } else {
                showToast("Buka Permainan / Save Dahulu!");
            }
        }

        public void applyCheatLevel() {
            int[] e = getE();
            if (e != null && e.length > 9) {
                e[7] = 40; // Max Level
                e[8] = 99999999; // Max XP
                e[9] = 99999999;
            } else {
                showToast("Buka Permainan / Save Dahulu!");
            }
        }

        public void applyCheatEnergy() {
            int[] e = getE();
            if (e != null && e.length > 42) {
                e[41] = 100; // 100% Energy
                e[42] = 100;
                e[15] = 0;   // Reset recharge timer
            } else {
                showToast("Buka Permainan / Save Dahulu!");
            }
        }

        public void applyCheatCooldown() {
            int[] e = getE();
            if (e != null && e.length > 20) {
                e[12] = 0;
                e[13] = 0;
                e[14] = 0;
                e[15] = 0;
                e[19] = 0;
            } else {
                showToast("Buka Permainan / Save Dahulu!");
            }
        }
    }
}
