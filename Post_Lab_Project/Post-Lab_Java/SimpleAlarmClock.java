// Simple Alarm Clock:::

// Input: Set the alarm time and optional message.
// Output: Alarm triggered at the set time with a
// notification.

// Example:
// • Input: "Set alarm for 7:00 AM"
// • Output: "Alarm set for 7:00 AM."
// At 7:00 AM: "Wake up! It's 7:00 AM."


import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sound.sampled.*;
import java.io.File;

public class SimpleAlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: alarm time
        System.out.print("Set alarm (HH:mm): ");
        String alarmTime = scanner.nextLine();

        System.out.print("Optional message: ");
        String message = scanner.nextLine();

        // Sound file name (in same folder)
        String soundPath = "alarmbeep.wav";

        try {
            // Parse input time (24-hour format)
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date alarmDate = sdf.parse(alarmTime);

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Alarm! " + message + " It's " + alarmTime);
                    playSound(soundPath);
                    timer.cancel();
                }
            }, alarmDate);

            System.out.println("Alarm set for " + alarmTime);
        } catch (Exception e) {
            System.out.println("Invalid time format. Please use HH:mm (e.g., 07:00 or 19:30).");
        }

        scanner.close();
    }

    // Method to play sound
    public static void playSound(String soundFile) {
        try {
            File file = new File(soundFile);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Keep program alive until sound finishes
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error playing sound: " + e.getMessage());
        }
    }
}