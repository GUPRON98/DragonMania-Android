# 🐉 Gameloft Dragon Mania - Native Android Remaster

Porting Native Android mandiri untuk game klasik legendaris **Gameloft Dragon Mania** (Resolusi HD Samsung TS Lanskap) dengan runtime J2ME kustom berkinerja tinggi, dukungan penuh kontrol layar sentuh (*Full Native Touchscreen*), rendering layar penuh adaptif (*Adaptive Edge-to-Edge Fullscreen*), serta fitur **In-Game Cheat Engine**.

[![Download APK](https://img.shields.io/badge/Download-DragonMania.apk-brightgreen?style=for-the-badge&logo=android)](https://github.com/GUPRON98/DragonMania-Android/raw/main/DragonMania.apk)
[![Platform](https://img.shields.io/badge/Platform-Android%205.0%2B-blue?style=for-the-badge&logo=android)](https://github.com/GUPRON98/DragonMania-Android)
[![License](https://img.shields.io/badge/Status-Remastered-orange?style=for-the-badge)](https://github.com/GUPRON98/DragonMania-Android)

---

## 📥 Unduh Game (Download APK)

Anda dapat langsung mengunduh file APK yang sudah jadi, ditandatangani (*signed*), dan siap pasang di semua HP Android:
- **Download Langsung**: [DragonMania.apk](https://github.com/GUPRON98/DragonMania-Android/raw/main/DragonMania.apk)

---

## ✨ Fitur Utama Remaster

- **🚀 100% Native Android Performance**: Berjalan langsung pada runtime Android ART/Dalvik tanpa emulator pihak ketiga yang berat.
- **📱 Adaptive Edge-to-Edge Fullscreen**:
  - Tampilan visual game otomatis merenggang penuh mengikuti 100% rasio layar HP pengguna (16:9, 18:9, 19.5:9, 20:9, tablet).
  - Tidak ada bilah hitam (*no black bars*).
  - Mendukung bypass poni kamera/notch (*display cutout*).
- **👆 Full Native Touchscreen Controls**:
  - Konversi matriks koordinat rotasi presisi dari sensor Samsung TS ke landscape Android.
  - Respon sentuh jari (tap, swipe, drag pulau, interaksi naga, pertarungan) akurat 1:1.
- **🛡️ True Double-Buffering (Anti-Flicker)**:
  - Rendering 60 FPS bebas tearing dan bebas flickering.
- **💾 Auto-Save Persistent (RMS)**:
  - Data progres pulau, naga, dan bangunan tersimpan aman di penyimpanan internal aplikasi.
- **⚡ In-Game Cheat Engine**:
  - Tombol melayang `[ ⚡ CHEAT ]` di pojok kanan atas layar dengan menu interaktif:
    - 💰 **+99.999.999 Gold / Coins**
    - 💎 **+99.999.999 Gems / Cash**
    - 🍎 **+99.999.999 Food (Makanan Naga)**
    - 👑 **Max Level 40 & Max XP**
    - ⚡ **Max Energy (100% Stamina Pulih)**
    - ⏳ **Skip Semua Cooldown (Hatching, Breeding, Building Instan)**

---

## 🛠️ Kompilasi Manual (Termux / Linux)

Prasyarat: `openjdk-21`, `aapt`, `d8`, `zipalign`, `apksigner`.

```bash
git clone https://github.com/GUPRON98/DragonMania-Android.git
cd DragonMania-Android
./build_apk.sh
```
File APK output akan otomatis tersimpan di root project dan siap dipasang.
