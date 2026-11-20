# 🐉 Gameloft Dragon Mania - Native Android Remaster

Porting Native Android mandiri untuk game klasik legendaris **Gameloft Dragon Mania** (Resolusi HD Landscape 800x480 Samsung TS Lanskap) dengan runtime J2ME kustom berkinerja tinggi, dukungan penuh kontrol layar sentuh (*Full Native Touchscreen*), rendering double-buffering 60 FPS bebas tearing, dan audio terintegrasi.

---

## 📥 Lokasi File APK
- `/sdcard/ai/DragonMania.apk`
- `/sdcard/DragonMania.apk`
- `DragonMania-Android/DragonMania.apk`

---

## ✨ Fitur Utama

- **🚀 100% Native Android Performance**: Dijalankan langsung melalui Android ART/Dalvik tanpa emulator pihak ketiga.
- **👆 Full Native Touchscreen Support**: Kontrol sentuh langsung pada layar game (drag, tap, select, interaksi naga, pertarungan) dengan konversi koordinat presisi.
- **🛡️ True Double-Buffering (Bebas Flicker)**: Sinkronisasi atomic flip mencegah tearing & glitch tampilan grafis.
- **📱 Immersive Fullscreen**: Tampilan layar penuh lanskap (sensorLandscape) yang menyembunyikan status bar dan bar navigasi secara otomatis.
- **💾 RMS Persistent Storage**: Sistem penyimpanan data game otomatis tersimpan di storage internal aplikasi.
- **🎵 J2ME Media Engine**: Dukungan pemutaran audio/efek suara game.

---

## 🔨 Cara Kompilasi Manual (Termux)

```bash
cd ~/DragonMania-Android
./build_apk.sh
```
