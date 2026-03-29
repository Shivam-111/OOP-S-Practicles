import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.sound.sampled.*;
import java.io.File;

public class SmartAlarmClock {

    JFrame frame;
    JTextField dateTimeField, messageField;
    JComboBox<String> amPmBox;
    JLabel clockLabel, statusLabel;
    JButton setAlarmBtn, snoozeBtn;
    JTextArea alarmListArea;

    ArrayList<String> alarms = new ArrayList<>();
    String alarmMessage = "Wake up!";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");

    public SmartAlarmClock() {
        frame = new JFrame("Smart Alarm Clock");
        frame.setSize(600, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window
        frame.setLayout(new BorderLayout(15, 15));
        frame.getContentPane().setBackground(new Color(25, 25, 25));

        // Clock at top
        clockLabel = new JLabel("", SwingConstants.CENTER);
        clockLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        clockLabel.setForeground(new Color(0, 255, 128));
        clockLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(clockLabel, BorderLayout.NORTH);

        // Center panel with inputs
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(new Color(25, 25, 25));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;

        JLabel inputLabel = new JLabel("Enter Date & Time (dd-MM-yyyy hh:mm):");
        inputLabel.setForeground(Color.WHITE);
        inputLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        centerPanel.add(inputLabel, gbc);

        gbc.gridy++;
        dateTimeField = new JTextField(15);
        dateTimeField.setFont(new Font("Consolas", Font.PLAIN, 14));
        dateTimeField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
        centerPanel.add(dateTimeField, gbc);

        gbc.gridy++;
        amPmBox = new JComboBox<>(new String[]{"AM", "PM"});
        amPmBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        amPmBox.setBackground(new Color(40, 40, 40));
        amPmBox.setForeground(Color.WHITE);
        centerPanel.add(amPmBox, gbc);

        gbc.gridy++;
        JLabel msgLabel = new JLabel("Enter Message:");
        msgLabel.setForeground(Color.WHITE);
        msgLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        centerPanel.add(msgLabel, gbc);

        gbc.gridy++;
        messageField = new JTextField(15);
        messageField.setFont(new Font("Consolas", Font.PLAIN, 14));
        messageField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
        centerPanel.add(messageField, gbc);

        frame.add(centerPanel, BorderLayout.CENTER);

        // Buttons at bottom
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBackground(new Color(25, 25, 25));

        setAlarmBtn = new JButton("Set Alarm");
        setAlarmBtn.setBackground(new Color(0, 153, 255));
        setAlarmBtn.setForeground(Color.WHITE);
        setAlarmBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        setAlarmBtn.setFocusPainted(false);

        snoozeBtn = new JButton("Snooze 5 min");
        snoozeBtn.setBackground(new Color(255, 102, 0));
        snoozeBtn.setForeground(Color.WHITE);
        snoozeBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        snoozeBtn.setFocusPainted(false);

        buttonPanel.add(setAlarmBtn);
        buttonPanel.add(snoozeBtn);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Status + Alarm list on right
        JPanel rightPanel = new JPanel(new BorderLayout(10, 10));
        rightPanel.setBackground(new Color(25, 25, 25));
        rightPanel.setPreferredSize(new Dimension(220, 0));

        statusLabel = new JLabel("No alarm set", SwingConstants.CENTER);
        statusLabel.setForeground(Color.YELLOW);
        statusLabel.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        statusLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        rightPanel.add(statusLabel, BorderLayout.NORTH);

        alarmListArea = new JTextArea();
        alarmListArea.setEditable(false);
        alarmListArea.setBackground(new Color(40, 40, 40));
        alarmListArea.setForeground(Color.CYAN);
        alarmListArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        alarmListArea.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
        rightPanel.add(new JScrollPane(alarmListArea), BorderLayout.CENTER);

        frame.add(rightPanel, BorderLayout.EAST);

        // Button actions
        setAlarmBtn.addActionListener(e -> setAlarm());
        snoozeBtn.addActionListener(e -> snoozeAlarm());

        frame.setVisible(true);

        startClock();
        checkAlarm();
    }

    // Set Alarm
    public void setAlarm() {
        String input = dateTimeField.getText().trim();
        String amPm = (String) amPmBox.getSelectedItem();
        alarmMessage = messageField.getText();

        if (alarmMessage.isEmpty()) {
            alarmMessage = "Wake up!";
        }

        String fullInput = input + " " + amPm;

        try {
            LocalDateTime.parse(fullInput, formatter);
            alarms.add(fullInput);

            statusLabel.setText("Alarm set for " + fullInput);
            updateAlarmList();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Invalid format! Use dd-MM-yyyy hh:mm and select AM/PM");
        }
    }

    // Snooze Feature
    public void snoozeAlarm() {
        LocalDateTime snoozeTime = LocalDateTime.now().plusMinutes(5);
        String newTime = snoozeTime.format(formatter);

        alarms.add(newTime);
        statusLabel.setText("Snoozed to " + newTime);
        updateAlarmList();
    }

    // Play Sound
    public void playSound() {
        try {
            File file = new File("alarmbeep.wav"); // keep this file in project folder
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep(); // fallback
        }
    }

    // Live Clock
    public void startClock() {
        Timer timer = new Timer(1000, e -> {
            LocalDateTime now = LocalDateTime.now();
            clockLabel.setText("Current: " + now.format(formatter));
        });
        timer.start();
    }

    // Check Alarms
    public void checkAlarm() {
        Timer timer = new Timer(1000, e -> {
            LocalDateTime now = LocalDateTime.now();
            String current = now.format(formatter);

            if (alarms.contains(current)) {
                playSound();

                JOptionPane.showMessageDialog(frame,
                        alarmMessage + "\nTime: " + current,
                        "Alarm",
                        JOptionPane.INFORMATION_MESSAGE);

                alarms.remove(current);
                updateAlarmList();
            }
        });
        timer.start();
    }

    // Update Alarm List UI
    public void updateAlarmList() {
        alarmListArea.setText("");
        for (String a : alarms) {
            alarmListArea.append("Alarm: " + a + "\n");
        }
    }

    public static void main(String[] args) {
        new SmartAlarmClock();
    }
}