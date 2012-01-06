package com.skoev.timer;
import java.util.*; 
import java.awt.event.KeyEvent; 


/**
 * This class contains the application's view state and view logic. It contains 
 * a number of javax.swing components, which render the view, take 
 * input from the user, and fire events when certain user actions are performed. 
 * Some of these components are displayed in secondary application windows 
 * ({@link #aboutFrame}, {@link #lockSettingsFrame}, and 
 * {@link #soundSettingsFrame}) so that the main widow is not too cluttered. 
 * 
 * <br/><br/>This class contains  
 * little or no application logic; the application state and logic are handled 
 * by {@link #timerControl}.
 * 
 */
public class TimerPanel extends javax.swing.JPanel {
    /**
     * Creates a new TimerPanel and initializes its contents by calling the
     * private init
     * methods
     */
    public TimerPanel() {
        initComponents();
        initManualComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form; its contents are generated automatically by the 
     * Form Editor in Netbeans, where javax.swing components were instanced, 
     * positioned, and wired to event listeners graphically. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lockSettingsFrame = new javax.swing.JFrame();
        lockSettingsTitleLabel = new javax.swing.JLabel();
        keysPressed = new javax.swing.JLabel();
        resetShortcut = new javax.swing.JButton();
        saveShortcut = new javax.swing.JButton();
        beginRecording = new javax.swing.JButton();
        currentShortcut = new javax.swing.JLabel();
        cancelRecording = new javax.swing.JButton();
        lockSettingsScrollPane = new javax.swing.JScrollPane();
        lockSettingsTextArea = new javax.swing.JTextArea();
        testShortcut = new javax.swing.JButton();
        closeLockSettings = new javax.swing.JButton();
        currentShortcutLabel = new javax.swing.JLabel();
        keysPressedLabel = new javax.swing.JLabel();
        lockRepeatedly = new javax.swing.JCheckBox();
        multiplePressUncheckedLabel = new javax.swing.JLabel();
        aboutFrame = new javax.swing.JFrame();
        closeAbout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutTextArea = new javax.swing.JTextArea();
        soundSettingsFrame = new javax.swing.JFrame();
        soundSettingsTitleLabel = new javax.swing.JLabel();
        useSampledAudio = new javax.swing.JCheckBox();
        useToolkitBeep = new javax.swing.JCheckBox();
        useBeeper = new javax.swing.JCheckBox();
        saveChanges = new javax.swing.JButton();
        soundFrequencyLabel = new javax.swing.JLabel();
        soundFrequency = new javax.swing.JTextField();
        soundDurationLabel = new javax.swing.JLabel();
        soundDuration = new javax.swing.JTextField();
        resetSound = new javax.swing.JButton();
        closeSoundSettings = new javax.swing.JButton();
        testSound = new javax.swing.JButton();
        soundSettingsScrollPane = new javax.swing.JScrollPane();
        soundSettingsTextArea = new javax.swing.JTextArea();
        soundFreqVerLabel = new javax.swing.JLabel();
        soundDurVerLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        workTimeLabel = new javax.swing.JLabel();
        workTimeOutput = new javax.swing.JLabel();
        workTimeRemainingLabel = new javax.swing.JLabel();
        workTimeInput = new javax.swing.JTextField();
        loopTimer = new javax.swing.JCheckBox();
        playSoundBreaktime = new javax.swing.JCheckBox();
        lockOnBreaktime = new javax.swing.JCheckBox();
        mainScreenTitle = new javax.swing.JLabel();
        pauseButton = new javax.swing.JButton();
        breakTimeInput = new javax.swing.JTextField();
        breakTimeLabel = new javax.swing.JLabel();
        breakTimeRemainingLabel = new javax.swing.JLabel();
        playSoundWorktime = new javax.swing.JCheckBox();
        breakTimeOutput = new javax.swing.JLabel();
        settingsWarningLabel = new javax.swing.JLabel();
        lockSettingsButton = new javax.swing.JButton();
        soundSettingsButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        timeInputVerLabel = new javax.swing.JLabel();

        lockSettingsTitleLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        lockSettingsTitleLabel.setText("Screen lock settings");

        keysPressed.setText("keysPressed");

        resetShortcut.setText("Reset default");
        resetShortcut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetShortcutActionPerformed(evt);
            }
        });

        saveShortcut.setText("Save shorctut");
        saveShortcut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveShortcutActionPerformed(evt);
            }
        });

        beginRecording.setText("Begin recording new shorcut");
        beginRecording.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginRecordingActionPerformed(evt);
            }
        });
        beginRecording.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                beginRecordingKeyPressed(evt);
            }
        });

        currentShortcut.setText("currentShortcut");

        cancelRecording.setText("Cancel");
        cancelRecording.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRecordingActionPerformed(evt);
            }
        });

        lockSettingsScrollPane.setFocusable(false);
        lockSettingsScrollPane.setOpaque(false);

        lockSettingsTextArea.setColumns(20);
        lockSettingsTextArea.setFont(new java.awt.Font("DejaVu Sans", 0, 14));
        lockSettingsTextArea.setLineWrap(true);
        lockSettingsTextArea.setRows(5);
        lockSettingsTextArea.setText("This application programmatically \"presses\" the keyboard shourcut keys for screen locking in order to lock your screen during the break. The key combination differs with operating systems and user settings. For example, Windows uses Windows-L, Mac uses Ctrl-Shift-Eject, and many Linux distributions use Ctrl-Alt-L. \n\nThe default keyboard shortcut here is Ctrl-Alt-L, which is what works on my system. If your system has a different shortcut, please enter it by following these steps: \n1) Press \"Begin recording new shortcut\"\n2) Enter the key combination, pressing one key at a time. Do not press all the keys together, as that will just lock your screen and the program won't be able to capture the keystrokes. If one of the keys pressed opens another window  or menu (e.g. the Windows key) or if it otherwise deselects this program's window (e.g. Alt key), simply select this program's window again by clicking on it with the mouse before pressing the next key.\n3) Verify that \"Keys pressed:\" shows the intended shortcut; if you made a mistake, repeat steps 1) and 2). Then, press \"Save shortcut\".  \n4) Press \"Test current shortcut\" to make sure that it actually locks the screen. \n\nNOTE: I have successfully tested the screen locking shortcuts on Ubuntu Linux 10.04 and Windows XP. However, screen locking may not work on all operating systems. Some OS's may not let programs activate certain keyboard shorcuts for security reasons. For example, in Windows 7 (unlike XP) the OS prevents this program from using the Windows-L shortcut. In that case, you can find a workaround by using some other keyboard shortcut to make your computer inaccessible during the break period. For example, in Windows 7, you can create a keyboard shortcut to start the screensaver and use that instead of locking the screen (I have successfully tested that approach with Windows 7). ");
        lockSettingsTextArea.setWrapStyleWord(true);
        lockSettingsTextArea.setBorder(null);
        lockSettingsTextArea.setFocusable(false);
        lockSettingsTextArea.setOpaque(false);
        lockSettingsScrollPane.setViewportView(lockSettingsTextArea);

        testShortcut.setText("Test current shorcut");
        testShortcut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testShortcutActionPerformed(evt);
            }
        });

        closeLockSettings.setText("Close window");
        closeLockSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeLockSettingsActionPerformed(evt);
            }
        });

        currentShortcutLabel.setText("Current keyboard shortcut for locking screen: ");

        keysPressedLabel.setText("Keys pressed:");

        lockRepeatedly.setText("Press shortcut multiple times (once every second) during break. This prevents user from unlocking screen until break is over.");
        lockRepeatedly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockRepeatedlyActionPerformed(evt);
            }
        });

        multiplePressUncheckedLabel.setText("If left unchecked, the keyboard shortcut will be pressed only once (at beginning of break). ");

        javax.swing.GroupLayout lockSettingsFrameLayout = new javax.swing.GroupLayout(lockSettingsFrame.getContentPane());
        lockSettingsFrame.getContentPane().setLayout(lockSettingsFrameLayout);
        lockSettingsFrameLayout.setHorizontalGroup(
            lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lockSettingsTitleLabel)
                    .addComponent(lockSettingsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(multiplePressUncheckedLabel))
                    .addComponent(lockRepeatedly)
                    .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                        .addGap(743, 743, 743)
                        .addComponent(closeLockSettings))
                    .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                        .addComponent(keysPressedLabel)
                        .addGap(18, 18, 18)
                        .addComponent(keysPressed))
                    .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                        .addComponent(saveShortcut)
                        .addGap(18, 18, 18)
                        .addComponent(cancelRecording))
                    .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                        .addComponent(currentShortcutLabel)
                        .addGap(18, 18, 18)
                        .addComponent(currentShortcut)
                        .addGap(40, 40, 40)
                        .addComponent(testShortcut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetShortcut))
                    .addComponent(beginRecording))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lockSettingsFrameLayout.setVerticalGroup(
            lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lockSettingsTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lockSettingsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lockRepeatedly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiplePressUncheckedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lockSettingsFrameLayout.createSequentialGroup()
                        .addGroup(lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentShortcutLabel)
                            .addComponent(currentShortcut)
                            .addComponent(testShortcut)
                            .addComponent(resetShortcut))
                        .addGap(18, 18, 18)
                        .addComponent(beginRecording)
                        .addGap(18, 18, 18)
                        .addGroup(lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keysPressedLabel)
                            .addComponent(keysPressed))
                        .addGap(18, 18, 18)
                        .addGroup(lockSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveShortcut)
                            .addComponent(cancelRecording)))
                    .addComponent(closeLockSettings))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        closeAbout.setText("Close window");
        closeAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAboutActionPerformed(evt);
            }
        });

        aboutTextArea.setColumns(20);
        aboutTextArea.setFont(new java.awt.Font("DejaVu Sans", 0, 16));
        aboutTextArea.setLineWrap(true);
        aboutTextArea.setRows(5);
        aboutTextArea.setText("About this application: \n\nMost people who work at a computer all day will agree that it's good to take breaks. It allows you to relax your eyes, get the blood circulation going in your legs,  and regain mental sharpness. \n\nHowever, it takes a lot of discipline to take regular breaks when you are doing engaging work. Even if you have a timer or alarm set up, you are likely to ignore it or snooze it and keep going. This application is a timer that is impossible to ignore. After a pre-set work period elapses, it locks your computer screen and optionally prevents you from unlocking (by locking it again if you unlock it) until a pre-set break period elapses, thereby forcing you to take a break. \n\nThe application is written in Java, so it is cross-platform. It can be run on any computer that has Java installed. \n\nSo how do you regain control of your computer in the event that you accidentally set too long of a break period (with the unlock prevention option) and don't want to wait for it to end? In Linux, you can use Ctrl-Alt-F1 to switch to a text terminal and kill the java process. In Windows, I'm not aware of a way to do it other than restarting your computer -- so be careful when entering the break period.\n\nCreated by: Stefan Koev (stefan.koev@skoev.com)  \nLast updated: 27 December 2011\n\n");
        aboutTextArea.setWrapStyleWord(true);
        aboutTextArea.setBorder(null);
        aboutTextArea.setFocusable(false);
        aboutTextArea.setOpaque(false);
        jScrollPane1.setViewportView(aboutTextArea);

        javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
        aboutFrameLayout.setHorizontalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addGroup(aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeAbout))
                    .addGroup(aboutFrameLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        aboutFrameLayout.setVerticalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutFrameLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeAbout)
                .addContainerGap())
        );

        soundSettingsTitleLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        soundSettingsTitleLabel.setText("Sound settings");

        useSampledAudio.setText("Use java sampled audio API (synthesize own sound)");

        useToolkitBeep.setText("Use java.awt.Toolkit.beep() method (sounds system alert tone if configured)");

        useBeeper.setText("Use motherboard beeper (prints bell character 0x0007 to terminal)");

        saveChanges.setText("Save changes");
        saveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesActionPerformed(evt);
            }
        });

        soundFrequencyLabel.setText("Sound frequency (Hz)");

        soundFrequency.setText("2000");
        soundFrequency.setPreferredSize(new java.awt.Dimension(57, 27));

        soundDurationLabel.setText("Sound duration (milliseconds)");

        soundDuration.setText("200");
        soundDuration.setPreferredSize(new java.awt.Dimension(57, 27));

        resetSound.setText("Reset to defaults");
        resetSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSoundActionPerformed(evt);
            }
        });

        closeSoundSettings.setText("Close window");
        closeSoundSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeSoundSettingsActionPerformed(evt);
            }
        });

        testSound.setText("Test sound");
        testSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testSoundActionPerformed(evt);
            }
        });

        soundSettingsTextArea.setColumns(20);
        soundSettingsTextArea.setFont(new java.awt.Font("DejaVu Sans", 0, 16));
        soundSettingsTextArea.setLineWrap(true);
        soundSettingsTextArea.setRows(5);
        soundSettingsTextArea.setText("Getting sound to work across platforms is difficult. For this reason, I have included 3 different options below for playing the sound alert. At least one of them should work with your OS and configuration. \n\nThe first option is most likely to work. It also lets you choose the sound frequency and duration. If it doesn't work and you have other sound-producing programs running on your computer, exit those programs and try again. Depending on your sound mixer, it may not be able to work while other programs are using the mixer.");
        soundSettingsTextArea.setWrapStyleWord(true);
        soundSettingsTextArea.setBorder(null);
        soundSettingsTextArea.setFocusable(false);
        soundSettingsTextArea.setOpaque(false);
        soundSettingsScrollPane.setViewportView(soundSettingsTextArea);

        soundFreqVerLabel.setForeground(java.awt.Color.red);
        soundFreqVerLabel.setText("soundFreqVerLabel");

        soundDurVerLabel.setForeground(java.awt.Color.red);
        soundDurVerLabel.setText("soundDurVerLabel");

        javax.swing.GroupLayout soundSettingsFrameLayout = new javax.swing.GroupLayout(soundSettingsFrame.getContentPane());
        soundSettingsFrame.getContentPane().setLayout(soundSettingsFrameLayout);
        soundSettingsFrameLayout.setHorizontalGroup(
            soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soundSettingsTitleLabel)
                .addContainerGap(561, Short.MAX_VALUE))
            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useToolkitBeep)
                    .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                        .addGroup(soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(useBeeper)
                            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                                        .addComponent(soundFrequencyLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(soundFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(soundFreqVerLabel)
                                    .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                                        .addComponent(soundDurationLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(soundDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(soundDurVerLabel))))
                        .addContainerGap(238, Short.MAX_VALUE))))
            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(saveChanges)
                .addGap(18, 18, 18)
                .addComponent(resetSound)
                .addGap(18, 18, 18)
                .addComponent(testSound)
                .addGap(18, 18, 18)
                .addComponent(closeSoundSettings)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soundSettingsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(useSampledAudio)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        soundSettingsFrameLayout.setVerticalGroup(
            soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soundSettingsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soundSettingsTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soundSettingsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(useSampledAudio)
                .addGap(18, 18, 18)
                .addGroup(soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soundFrequencyLabel)
                    .addComponent(soundFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soundFreqVerLabel)
                .addGap(18, 18, 18)
                .addGroup(soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soundDurationLabel)
                    .addComponent(soundDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(soundDurVerLabel)
                .addGap(18, 18, 18)
                .addComponent(useToolkitBeep)
                .addGap(18, 18, 18)
                .addComponent(useBeeper)
                .addGap(18, 18, 18)
                .addGroup(soundSettingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChanges)
                    .addComponent(resetSound)
                    .addComponent(testSound)
                    .addComponent(closeSoundSettings))
                .addGap(34, 34, 34))
        );

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        workTimeLabel.setText("Work time (s)");

        workTimeOutput.setText("0");

        workTimeRemainingLabel.setText("Time remaining (s)");

        workTimeInput.setText("0");

        loopTimer.setText("Loop endlessly");

        playSoundBreaktime.setText("Play sound when it's time for a break");

        lockOnBreaktime.setText("Lock screen when it's time for a break*");

        mainScreenTitle.setFont(new java.awt.Font("DejaVu Sans", 0, 18));
        mainScreenTitle.setText("A timer that can lock your computer screen and force you to take a break ");

        pauseButton.setText("PAUSE");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        breakTimeInput.setText("0");

        breakTimeLabel.setText("Break time (s)");

        breakTimeRemainingLabel.setText("Time remaining (s)");

        playSoundWorktime.setText("Play sound when break is over");

        breakTimeOutput.setText("0");

        settingsWarningLabel.setText("*For this to work, you must verify screen locking settings first");

        lockSettingsButton.setText("Lock settings");
        lockSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockSettingsButtonActionPerformed(evt);
            }
        });

        soundSettingsButton.setText("Sound settings");
        soundSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundSettingsButtonActionPerformed(evt);
            }
        });

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        instructionLabel.setText("Choose settings and press start ... ");

        timeInputVerLabel.setForeground(java.awt.Color.red);
        timeInputVerLabel.setText("timeInputVerLabel");
        timeInputVerLabel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionLabel)
                            .addComponent(mainScreenTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aboutButton)
                                .addGap(82, 82, 82)
                                .addComponent(startButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pauseButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeInputVerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(workTimeLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(breakTimeLabel)
                                        .addComponent(workTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(breakTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(workTimeRemainingLabel)
                                    .addComponent(breakTimeRemainingLabel)
                                    .addComponent(workTimeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(breakTimeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playSoundBreaktime)
                                .addGap(18, 18, 18)
                                .addComponent(soundSettingsButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(settingsWarningLabel)
                                .addGap(18, 18, 18)
                                .addComponent(lockSettingsButton))
                            .addComponent(lockOnBreaktime)
                            .addComponent(playSoundWorktime)
                            .addComponent(loopTimer))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainScreenTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instructionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aboutButton)
                    .addComponent(pauseButton)
                    .addComponent(startButton))
                .addGap(26, 26, 26)
                .addComponent(timeInputVerLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workTimeLabel)
                    .addComponent(workTimeRemainingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workTimeOutput))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(breakTimeLabel)
                    .addComponent(breakTimeRemainingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakTimeOutput))
                .addGap(26, 26, 26)
                .addComponent(lockOnBreaktime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsWarningLabel)
                    .addComponent(lockSettingsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playSoundBreaktime)
                    .addComponent(soundSettingsButton))
                .addGap(18, 18, 18)
                .addComponent(playSoundWorktime)
                .addGap(18, 18, 18)
                .addComponent(loopTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /** This method is called from within the constructor to initialize the 
     * javax.swing components in the form from values in the application's 
     * controller {@link TimerControl}; its conents are written manually. 
     * It also instantiates a javax.Swing.Timer component that fires every 1000ms
     * and wires it to an event listener; this component is the source of timing 
     * for the application. 
     */ 
    private void initManualComponents(){

        java.awt.event.ActionListener timerActionListener = new java.awt
                .event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    timerActionPerformed(evt);
            }
        };               
        
        swingTimer = new javax.swing.Timer(1000,timerActionListener);
        
        workTimeInput.setText(Integer.toString(timerControl.getWorkTimeSet()));
        breakTimeInput.setText(Integer.toString(timerControl.getBreakTimeSet()));
        updateOutputs();
        lockOnBreaktime.setSelected(timerControl.isLockOnBreaktime()); 
        playSoundWorktime.setSelected(timerControl.isPlaySoundWorktime()); 
        playSoundBreaktime.setSelected(timerControl.isPlaySoundBreaktime()); 
        loopTimer.setSelected(timerControl.isLoop()); 
        
        lockRepeatedly.setSelected(timerControl.isLockRepeatedly()); 
        currentShortcut.setText(timerControl.getScreenLocker()
                .currentShorcutString());       
        keysPressed.setText(timerControl.getScreenLocker().keysPressedString());
                
        updateSoundSettings(); 
        
        timeInputVerLabel.setText("");         
        workTimeInput.setInputVerifier(new TimeInputVerifier(timeInputVerLabel));   
        breakTimeInput.setInputVerifier(new TimeInputVerifier(timeInputVerLabel)); 
        soundFreqVerLabel.setText("");
        soundFrequency.setInputVerifier(new SoundFreqInputVerifier(
                soundFreqVerLabel));
        soundDurVerLabel.setText("");
        soundDuration.setInputVerifier(new SoundDurInputVerifier(
                soundDurVerLabel)); 
    }

    /**
     * Event listener for the swingTimer object. When that object fires and event, 
     * this method calls the {@link TimerControl#decrementTimer } method.  
     * 
     */ 
    private void timerActionPerformed(java.awt.event.ActionEvent evt){
        if(!timerControl.decrementTimer()){
            swingTimer.stop(); 
            startButton.setText("START");
            setInputsEnabled(true);
        }
        updateOutputs();        
        
    }

    /**
     * A convenience method to update the {@link #workTimeOutput} and 
     * {@link #breakTimeOutput} 
     * from the values in the {@link #timerControl}
     */
    private void updateOutputs(){
        workTimeOutput.setText(Integer.toString(timerControl.getWorkTimeLeft()));
        workTimeOutput.updateUI();
        breakTimeOutput.setText(Integer.toString(timerControl.getBreakTimeLeft()));
        breakTimeOutput.updateUI();        
    } 
    
    /**
     * A convenience method to update the {@link #useSampledAudio},
     * {@link #useToolkitBeep}, {@link #useBeeper}, {@link #soundFrequency}, and 
     * {@link #soundDuration} from values in {@link #timerControl}
     */
    private void updateSoundSettings(){    
        useSampledAudio.setSelected(timerControl.getSoundPlayer()
                .isUseSampledAudio()); 
        useToolkitBeep.setSelected(timerControl.getSoundPlayer()
                .isUseToolkitBeep()); 
        useBeeper.setSelected(timerControl.getSoundPlayer().isUseBeeper()); 
        soundFrequency.setText(Integer.toString(timerControl.getSoundPlayer()
                .getSoundFrequency())); 
        soundDuration.setText(Integer.toString(timerControl.getSoundPlayer()
                .getSoundDuration()));                             
    }
    
    /**
     * This method disables some of the inputs while the timer is working and 
     * displays a message that the timer must be stopped in order to change 
     * settings. 
     *  
     */
    private void setInputsEnabled(boolean value){
        lockOnBreaktime.setEnabled(value);
        settingsWarningLabel.setEnabled(value);
        playSoundBreaktime.setEnabled(value); 
        playSoundWorktime.setEnabled(value); 
        loopTimer.setEnabled(value); 
        workTimeInput.setEnabled(value); 
        breakTimeInput.setEnabled(value); 
        lockSettingsButton.setEnabled(value);
        soundSettingsButton.setEnabled(value);
        if (value){
            instructionLabel.setText("Choose settings and press start ... "); 
        }
        else{
            instructionLabel.setText("To change settings, stop timer first."); 
        }                
    }
     
    /**
     * Event listener for the {@link #startButton} component. When the start 
     * button is pressed, the start button becomes a stop button and the timer
     * is started. When the stop button is pressed, the stop button becomes a 
     * start button and the timer is stopped. 
     * 
     */ 
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        if ("START".equals(startButton.getText())){
            if (!startButton.isFocusOwner())
                return;
            
            startButton.setText("STOP");  
            pauseButton.setText("PAUSE"); 
            // update timer control values from form fields
            timerControl.setBreakTimeSet(Integer.parseInt(breakTimeInput
                    .getText()));
            timerControl.setWorkTimeSet(Integer.parseInt(workTimeInput.getText()));
            timerControl.setWorkTimeLeft(timerControl.getWorkTimeSet()); 
            timerControl.setBreakTimeLeft(timerControl.getBreakTimeSet()); 
            // update ouputs from timer control values
            updateOutputs();                        
            
            // update timer control options from checkboxes
            timerControl.setLoop(loopTimer.isSelected());
            timerControl.setPlaySoundBreaktime(playSoundBreaktime.isSelected());
            timerControl.setPlaySoundWorktime(playSoundWorktime.isSelected());
            timerControl.setLockOnBreaktime(lockOnBreaktime.isSelected());
                     
                        
            //initialize timer control
            timerControl.setNowBreak(false); 
            timerControl.setCycleComplete(false);          
            
            //disable inputs
            setInputsEnabled(false);
            
            //close open windows in case they are open
            lockSettingsFrame.setVisible(false);
            soundSettingsFrame.setVisible(false); 
            
            //start timer
            swingTimer.start();              
        }
        else {
            startButton.setText("START");
            pauseButton.setText("PAUSE"); 
            swingTimer.stop();
            // reset time left
            timerControl.setWorkTimeLeft(timerControl.getWorkTimeSet()); 
            timerControl.setBreakTimeLeft(timerControl.getBreakTimeSet()); 
            // update outputs from timer control values
            updateOutputs(); 
            //enable inputs
            setInputsEnabled(true); 
        }     
        
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * If the begnRecording key ({@link #beginRecording}) button has been pressed, 
     * this method saves all the keyboard keystrokes. 
     */
    private void beginRecordingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beginRecordingKeyPressed
        // TODO add your handling code here: 
        timerControl.getScreenLocker().getKeysPressed().add(evt.getKeyCode());
        keysPressed.setText(timerControl.getScreenLocker().keysPressedString());
    }//GEN-LAST:event_beginRecordingKeyPressed

    /**
     * When the lock settings button is pressed, a new window
     * ({@link #lockSettingsFrame}) is opened. 
     */
    private void lockSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockSettingsButtonActionPerformed
        // TODO add your handling code here:
        lockSettingsFrame.pack();
        lockSettingsFrame.setVisible(true);
    }//GEN-LAST:event_lockSettingsButtonActionPerformed

    /**
     * When the about button is pressed, a new window ({@link #aboutFrame})
     * is opened.
     */
    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        aboutFrame.pack();
        aboutFrame.setVisible(true); 
    }//GEN-LAST:event_aboutButtonActionPerformed

    /**
     * Closes the {@link #aboutFrame} window.
     * 
     */
    private void closeAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAboutActionPerformed
        // TODO add your handling code here:
        aboutFrame.setVisible(false); 
    }//GEN-LAST:event_closeAboutActionPerformed

    /**
     * Event listener for pressing the {@link #beginRecording} button; this method
     * clears any previously saved keystrokes. 
     * 
     */
    private void beginRecordingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginRecordingActionPerformed
        // TODO add your handling code here:      
        timerControl.getScreenLocker().getKeysPressed().clear();
        keysPressed.setText(""); 
    }//GEN-LAST:event_beginRecordingActionPerformed

    /**
     * Closes the {@link #lockSettingsFrame} window.
     * 
     */
    private void closeLockSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeLockSettingsActionPerformed
        // TODO add your handling code here:
        lockSettingsFrame.setVisible(false);
    }//GEN-LAST:event_closeLockSettingsActionPerformed

    
    /**
     * Opens the {@link #soundSettingsFrame } window if {@link #soundSettingsButton }
     * has been pressed
     * 
     */
    private void soundSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundSettingsButtonActionPerformed
        // TODO add your handling code here:
        soundSettingsFrame.pack();
        soundSettingsFrame.setVisible(true);
    }//GEN-LAST:event_soundSettingsButtonActionPerformed

    /**
     * Close the {@link #soundSettingsFrame } window
     * 
     */
    private void closeSoundSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSoundSettingsActionPerformed
        // TODO add your handling code here:
        soundSettingsFrame.setVisible(false);
    }//GEN-LAST:event_closeSoundSettingsActionPerformed

    /**
     * If the pause button has been pressed, stop the {@link #swingTimer} and
     * make it a "continue" button.      
     */
    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        // TODO add your handling code here:
        if ("PAUSE".equals(pauseButton.getText()) && "STOP".equals(startButton
                .getText())){
            pauseButton.setText("CONTINUE");
            if (swingTimer.isRunning()) swingTimer.stop();
        }
        else if ("CONTINUE".equals(pauseButton.getText()) && "STOP".equals(
                startButton.getText())){
            pauseButton.setText("PAUSE");
            if (!swingTimer.isRunning())swingTimer.start();
        }
    }//GEN-LAST:event_pauseButtonActionPerformed

    /**
     * Save the newly entered keystrokes as the future shortcut to be used for 
     * screen locking; the value of that shortcut is stored in the 
     * {@link #timerControl}'s {@link ScreenLocker} object. 
     */
    private void saveShortcutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveShortcutActionPerformed
        // TODO add your handling code here:
        timerControl.getScreenLocker().saveShortcut();
        timerControl.getScreenLocker().clearKeysPressed();
        keysPressed.setText("");
        currentShortcut.setText(timerControl.getScreenLocker()
                .currentShorcutString());
    }//GEN-LAST:event_saveShortcutActionPerformed

    /**
     * 
     * Discard the newly entered keystrokes. 
     */
    private void cancelRecordingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRecordingActionPerformed
        // TODO add your handling code here:
        timerControl.getScreenLocker().clearKeysPressed();
        keysPressed.setText("");
    }//GEN-LAST:event_cancelRecordingActionPerformed

    /**
     * Try locking the screen using the currently saved keyboard shortcut in 
     * {@link #timerControl}'s {@link ScreenLocker} object.
     * 
     */
    private void testShortcutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testShortcutActionPerformed
        // TODO add your handling code here:
        timerControl.getScreenLocker().lock();
    }//GEN-LAST:event_testShortcutActionPerformed

    /**
     * Discard the currently saved keyboard shortcut for screen locking
     * and reset it to the default. 
     * 
     */
    private void resetShortcutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetShortcutActionPerformed
        // TODO add your handling code here:
        timerControl.getScreenLocker().useDefaultShortcut();
        currentShortcut.setText(timerControl.getScreenLocker()
                .currentShorcutString());
    }//GEN-LAST:event_resetShortcutActionPerformed

    /**
     * Save the current values of the swing components in the 
     * {@link #soundSettingsFrame} window to the {@link #SoundPlayer} object in 
     * {@link #timerControl}
     * 
     */
    private void saveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesActionPerformed
        // TODO add your handling code here:
        if(!saveChanges.isFocusOwner())
            return;
        int duration = Integer.parseInt(soundDuration.getText()); 
        int freq = Integer.parseInt(soundFrequency.getText()); 
        
        timerControl.getSoundPlayer().setSoundDuration(duration);
        timerControl.getSoundPlayer().setSoundFrequency(freq);
        
        timerControl.getSoundPlayer().setUseBeeper(useBeeper.isSelected());
        timerControl.getSoundPlayer().setUseToolkitBeep(useToolkitBeep
                .isSelected());
        timerControl.getSoundPlayer().setUseSampledAudio(useSampledAudio
                .isSelected());
        
    }//GEN-LAST:event_saveChangesActionPerformed

    /**
     * Discard the current sound settings in the {@link #SoundPlayer} object in 
     * {@link #timerControl} and reset to the defaults. 
     * 
     */
    private void resetSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSoundActionPerformed
        // TODO add your handling code here:
        timerControl.getSoundPlayer().useDefaults();
        updateSoundSettings();
    }//GEN-LAST:event_resetSoundActionPerformed

    /**
     * Play a sound using the  {@link #SoundPlayer} object in 
     * {@link #timerControl}
     */
    private void testSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testSoundActionPerformed
        // TODO add your handling code here:
        timerControl.getSoundPlayer().sound();
    }//GEN-LAST:event_testSoundActionPerformed

   /**
     * If the {@link #lockRepeatedly} checkbox value has changed, save it to the 
     * corresponding field in {@link #timerControl}
     * 
     */
    private void lockRepeatedlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockRepeatedlyActionPerformed
        // TODO add your handling code here:
        timerControl.setLockRepeatedly(lockRepeatedly.isSelected());
    }//GEN-LAST:event_lockRepeatedlyActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JFrame aboutFrame;
    private javax.swing.JTextArea aboutTextArea;
    private javax.swing.JButton beginRecording;
    private javax.swing.JTextField breakTimeInput;
    private javax.swing.JLabel breakTimeLabel;
    private javax.swing.JLabel breakTimeOutput;
    private javax.swing.JLabel breakTimeRemainingLabel;
    private javax.swing.JButton cancelRecording;
    private javax.swing.JButton closeAbout;
    private javax.swing.JButton closeLockSettings;
    private javax.swing.JButton closeSoundSettings;
    private javax.swing.JLabel currentShortcut;
    private javax.swing.JLabel currentShortcutLabel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keysPressed;
    private javax.swing.JLabel keysPressedLabel;
    private javax.swing.JCheckBox lockOnBreaktime;
    private javax.swing.JCheckBox lockRepeatedly;
    private javax.swing.JButton lockSettingsButton;
    private javax.swing.JFrame lockSettingsFrame;
    private javax.swing.JScrollPane lockSettingsScrollPane;
    private javax.swing.JTextArea lockSettingsTextArea;
    private javax.swing.JLabel lockSettingsTitleLabel;
    private javax.swing.JCheckBox loopTimer;
    private javax.swing.JLabel mainScreenTitle;
    private javax.swing.JLabel multiplePressUncheckedLabel;
    private javax.swing.JButton pauseButton;
    private javax.swing.JCheckBox playSoundBreaktime;
    private javax.swing.JCheckBox playSoundWorktime;
    private javax.swing.JButton resetShortcut;
    private javax.swing.JButton resetSound;
    private javax.swing.JButton saveChanges;
    private javax.swing.JButton saveShortcut;
    private javax.swing.JLabel settingsWarningLabel;
    private javax.swing.JLabel soundDurVerLabel;
    private javax.swing.JTextField soundDuration;
    private javax.swing.JLabel soundDurationLabel;
    private javax.swing.JLabel soundFreqVerLabel;
    private javax.swing.JTextField soundFrequency;
    private javax.swing.JLabel soundFrequencyLabel;
    private javax.swing.JButton soundSettingsButton;
    private javax.swing.JFrame soundSettingsFrame;
    private javax.swing.JScrollPane soundSettingsScrollPane;
    private javax.swing.JTextArea soundSettingsTextArea;
    private javax.swing.JLabel soundSettingsTitleLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton testShortcut;
    private javax.swing.JButton testSound;
    private javax.swing.JLabel timeInputVerLabel;
    private javax.swing.JCheckBox useBeeper;
    private javax.swing.JCheckBox useSampledAudio;
    private javax.swing.JCheckBox useToolkitBeep;
    private javax.swing.JTextField workTimeInput;
    private javax.swing.JLabel workTimeLabel;
    private javax.swing.JLabel workTimeOutput;
    private javax.swing.JLabel workTimeRemainingLabel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.Timer swingTimer;    
        
    
    private TimerControl timerControl = new TimerControl(); 
    
    

}
