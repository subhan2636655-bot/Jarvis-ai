# JarvisAI v2 source project

Starter source for Samsung Galaxy A32 / Android 13.

Included:
- Tap-to-talk using Android SpeechRecognizer
- Android TextToSpeech replies (voice quality depends on installed system voice)
- App launch by matching installed app names
- Flashlight toggle
- Media volume up/down
- Opens phone dialer for a number (user confirms call)
- Foreground microphone service for simple clap peak detection

## Build
Upload the full project folder to a GitHub repository. GitHub Actions > Build Jarvis APK > Run workflow. Download the JarvisAI-debug-apk artifact and install the APK on the A32.

## Honest feature status
This is not yet a full Jarvis AI assistant. It does NOT yet include a generative AI brain, true "Hey Jarvis" wake-word recognition, contact-name resolution, reliable Urdu/Roman Urdu speech recognition, or full phone control. Clap detection is a simple loud-peak detector and may false-trigger or miss claps. It requires microphone permission and a visible foreground notification. Android may stop background work due to battery settings. Do not use microphone features where recording is not appropriate.

The app cannot silently place calls, bypass Android permission prompts, toggle restricted system settings, or control every app.
