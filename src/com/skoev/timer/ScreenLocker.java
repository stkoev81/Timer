package com.skoev.timer;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Class  responsible for storing the screen-lock keyboard shortcut and 
 * pressing it programmatically.  Used by {@link TimerControl}
 */
public class ScreenLocker {
    /**
     * Object providing programmtatic control of the keyboard. 
     */
    private Robot robot;
    /**
     * Default keyboard shortcut for screen locking is Ctrl-Alt-L
     */
    private static final Integer[] DEFAULT_SHORTCUT = 
            {KeyEvent.VK_CONTROL, KeyEvent.VK_ALT, KeyEvent.VK_L};
    /**
     * Current keyboard shortcut for screen locking; initialized to the default
     * shortcut but then user can change it. 
     */
    private List<Integer> currentShortcut ; 
    /**
     * Used to stores the keystrokes hit so far by the user after the 
     * {@link TimerPanel#beginRecording} has been pressed. 
     */
    private List<Integer> keysPressed = new ArrayList<Integer>();

    public ScreenLocker() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        useDefaultShortcut();        
    }

    /**
     * Locks screen by pressing and releasing {@link #currentShortcut}
     */
    public void lock() {
        for (Integer i : currentShortcut) {
            robot.keyPress(i);
        }

        for (int i = currentShortcut.size() - 1; i >= 0; i--) {
            robot.keyRelease(currentShortcut.get(i));
        }
    }

    /**
     * Gives a human-friendly representation of a keyboard shortcut. 
     * @param shortcutList A list of integers representing a keystrokes sequence.
     * @return A string representing the keystroke sequence. 
     */
    public String shortcutToString(List<Integer> shortcutList) {
        String shortcutString = "";
        for (Integer i : shortcutList) {
            shortcutString = shortcutString + "(" + KeyEvent.getKeyText(i) + ")";
        }
        return shortcutString;
    }
    /**
     * Saves {@link #keysPressed} as {@link #currentShortcut}
     */
    public void saveShortcut(){
        currentShortcut = new ArrayList<Integer>(keysPressed); 
    }
    
    /**
     * Discards the contents of {@link #keysPressed}
     */
    public void clearKeysPressed(){
        keysPressed.clear();
    }
    
    /**
     * Sets the current shortcut to the default shortcut; declared final
     * because it's not a good practice to call non-final 
     * methods from constructor
     */
    public final void useDefaultShortcut(){
        currentShortcut = new ArrayList<Integer>();
        for (Integer i : DEFAULT_SHORTCUT) {
            currentShortcut.add(i);
        }    
    }
       
    /**
     * Returns human friendly representation of the the current shortcut
     * {@link #currentShortcut}
     */
    public String currentShorcutString() {
        return shortcutToString(currentShortcut);
    }
    
    /**
     * Returns human friendly representation of the {@link #keysPressed}
     */
    public String keysPressedString(){
        return shortcutToString(keysPressed);
    }

    public static Integer[] getDEFAULT_SHORTCUT() {
        return DEFAULT_SHORTCUT;
    }

    public List<Integer> getCurrentShortcut() {
        return currentShortcut;
    }

    public List<Integer> getKeysPressed() {
        return keysPressed;
    }


    public void setCurrentShortcut(List<Integer> currentShortcut) {
        this.currentShortcut = currentShortcut;
    }

    public void setKeysPressed(List<Integer> keysPressed) {
        this.keysPressed = keysPressed;
    }

    
}
