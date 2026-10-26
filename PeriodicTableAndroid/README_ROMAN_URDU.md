# Periodic Table Android APK — Engnr Sohail Khan

Yeh Android Studio / GitHub Actions ke liye Android WebView project hai. HTML app phone ke andar hi bundle hai, is liye app ko chalane ke liye internet zaroori nahin.

## APK banane ka sab se asaan tareeqa (Android phone se)

1. ZIP file extract karein.
2. GitHub par naya repository banayein, misal: `periodic-table-sohail`.
3. Is folder ke andar ki tamam files/folders repository ke root mein upload karein. `.github/workflows/build-apk.yml` bhi upload honi chahiye.
4. GitHub repository mein **Actions** tab kholein.
5. Agar GitHub kahe to **I understand my workflows, go ahead and enable them** par tap karein.
6. `Build Android APK` workflow select karein aur **Run workflow** dabayein. Ya `main` branch par files push karne se build khud shuru ho sakta hai.
7. Green tick aane ke baad build run kholein, neeche **Artifacts** mein `PeriodicTable-SohailKhan-APK` download karein.
8. ZIP artifact extract karein. Andar `app-debug.apk` hoga. APK par tap karke install karein. Android agar pooche to browser/file manager ke liye **Install unknown apps** allow karein.

## Project details
- App label: Periodic Table - Sohail Khan
- Owner credit in app: Engnr Sohail Khan
- Built by: Sohail Khan
- Package ID: `com.sohailkhan.periodictable`
- Minimum Android: Android 6.0 (API 23)

Note: Yeh debug APK hai, testing/personal use ke liye. Public Play Store release ke liye signed release build aur Play Console setup alag se chahiye.
