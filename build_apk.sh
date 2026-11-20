#!/data/data/com.termux/files/usr/bin/bash
# =========================================================
#  BUILD SCRIPT - Dragon Mania Native Android APK
# =========================================================

set -e

PROJECT_DIR="$HOME/DragonMania-Android"
cd "$PROJECT_DIR"

if [ ! -f "android.jar" ]; then
  echo "📥 android.jar tidak ditemukan, menyalin atau mengunduh..."
  if [ -f "$HOME/DiamondRush-Android/android.jar" ]; then
    cp "$HOME/DiamondRush-Android/android.jar" .
  else
    curl -L -o android.jar "https://github.com/SupaRj/gow-betrayal-remastered-Android-Native-port/raw/main/android.jar"
  fi
fi

echo "🔥 [1/6] Menyiapkan direktori build..."
rm -rf build/gen build/obj build/apk build/unaligned.apk build/aligned.apk
mkdir -p build/gen build/obj build/apk

echo "🔨 [2/6] Generate R.java..."
aapt package -f -m \
  -J build/gen \
  -M app/src/main/AndroidManifest.xml \
  -S app/src/main/res \
  -I android.jar \
  --min-sdk-version 21 \
  --target-sdk-version 33

echo "☕ [3/6] Mengompilasi Java wrapper source..."
javac -cp "android.jar:build/gen" \
  -d build/obj \
  $(find build/gen -name "*.java") \
  $(find app/src/main/java -name "*.java")

echo "⚡ [4/6] Menggabungkan classes.dex dengan d8..."
d8 --lib android.jar \
   --output build/apk \
   build/test_dex/patched_game.apk \
   $(find build/obj -name "*.class")

echo "📦 [5/6] Mengemas APK dengan Assets & Zipalign..."
aapt package -f \
  -M app/src/main/AndroidManifest.xml \
  -S app/src/main/res \
  -A app/src/main/assets \
  -I android.jar \
  --min-sdk-version 21 \
  --target-sdk-version 33 \
  -F build/unaligned.apk

cd build/apk
aapt add ../unaligned.apk classes.dex
cd "$PROJECT_DIR"

zipalign -v -p 4 build/unaligned.apk build/aligned.apk

echo "🔐 [6/6] Menandatangani APK (Signing)..."
KEYSTORE="$HOME/FlappySawit/flappysawit.keystore"
if [ ! -f "$KEYSTORE" ]; then
  keytool -genkeypair -v \
    -keystore "$KEYSTORE" \
    -keyalg RSA -keysize 2048 -validity 10000 \
    -alias flappysawit \
    -storepass sawit123 \
    -keypass sawit123 \
    -dname "CN=DragonMania, OU=Game, O=Gameloft, L=ID, ST=ID, C=ID"
fi

mkdir -p /sdcard/ai
apksigner sign \
  --ks "$KEYSTORE" \
  --ks-key-alias flappysawit \
  --ks-pass pass:sawit123 \
  --key-pass pass:sawit123 \
  --out /sdcard/ai/DragonMania.apk \
  build/aligned.apk

cp -f /sdcard/ai/DragonMania.apk "$PROJECT_DIR/DragonMania.apk" 2>/dev/null || true
cp -f /sdcard/ai/DragonMania.apk /sdcard/DragonMania.apk 2>/dev/null || true

echo "🎉 BERHASIL! APK Game tersimpan di /sdcard/ai/DragonMania.apk"
ls -lh /sdcard/ai/DragonMania.apk
