package com.skoev.timer;

/**
 * This class is the application controller; it contains the state of the timer
 * and controls the transition between different states. Used by {@link
 * TimerPanel}.
 */
public class TimerControl {
    /**
     * How long should user work before it is time to take action such as
     * lock screen or play sound
     */
    private int workTimeSet = 900;
    
    private int workTimeLeft = workTimeSet;     
    /**
     * Length of the break period. 
     */
    private int breakTimeSet = 60; 
    private int breakTimeLeft = breakTimeSet; 
    /**
     * If true, sound played when work time elapses and it's time for a break. 
     */
    private boolean playSoundBreaktime = true; 
    /**
     * If true, sound played when break time elapses and it's time for work. 
     */
    private boolean playSoundWorktime = true; 
    /**
     * If true, lock screen when time for break
     */
    private boolean lockOnBreaktime = true; 
    /**
     * If true and {@link #lockOnBreaktime} is true, keep pressing screen-lock 
     * shortcut multiple times (once per second) during break; this prevents 
     * user from unlocking screen. 
     */
    private boolean lockRepeatedly = true;    
    /**
     * Flag set to true during break. 
     */
    private boolean nowBreak = false; 
    /**
     * If false, timer stops when both work time and break time expire. 
     */
    private boolean loop = false; 
    /**
     * Flag set to true when both work time and break time expire.
     */
    private boolean cycleComplete = false; 
    
    /**
     * Object used to play sounds
     */
    private SoundPlayer soundPlayer = new SoundPlayer();
    /**
     * Object used to lock screen
     */
    private ScreenLocker screenLocker = new ScreenLocker();
    
    /**
     * Decrements timer; this method is called by {@link 
     * TimerPanel#timerActionPerformed} every 1000 ms. The action taken depends 
     * on the current state of the timer and the control options. It can be to 
     * decrement the work time or break time, to reset the time, 
     * to lock the screen, and to 
     * to play a sound. 
     * 
     * @return false if both the work time and break time have elapsed and
     *         looping is not turned on, true otherwise
     *         
     */
    public boolean decrementTimer(){        
       if (cycleComplete && !loop){
           return false;
       }
        
       if (workTimeLeft>0 && !nowBreak){
           workTimeLeft--; 
           return true; 
       }
       if (workTimeLeft == 0 && !nowBreak){
           nowBreak = true; 
           if (lockOnBreaktime) screenLocker.lock();
           if (playSoundBreaktime) soundPlayer.sound();
           return true; 
       }
       
       if (breakTimeLeft>0 && nowBreak){
           if (lockOnBreaktime && lockRepeatedly) screenLocker.lock();
           breakTimeLeft--;
           return true; 
           
       }
       if (breakTimeLeft == 0 && nowBreak){                      
           cycleComplete = true; 
           if (playSoundWorktime) soundPlayer.sound();           
       }
              
       if (cycleComplete && loop){
           nowBreak = false;
           cycleComplete = false; 
           workTimeLeft = workTimeSet; 
           breakTimeLeft = breakTimeSet;
       }       
       return true;
    }

    public int getBreakTimeLeft() {
        return breakTimeLeft;
    }

    public int getBreakTimeSet() {
        return breakTimeSet;
    }

    public boolean isLoop() {
        return loop;
    }

    public boolean isNowBreak() {
        return nowBreak;
    }

    public ScreenLocker getScreenLocker() {
        return screenLocker;
    }

    public SoundPlayer getSoundPlayer() {
        return soundPlayer;
    }

    public int getWorkTimeLeft() {
        return workTimeLeft;
    }

    public int getWorkTimeSet() {
        return workTimeSet;
    }

    public void setBreakTimeLeft(int breakTimeLeft) {
        this.breakTimeLeft = breakTimeLeft;
    }

    public void setBreakTimeSet(int breakTimeSet) {
        this.breakTimeSet = breakTimeSet;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public void setNowBreak(boolean nowBreak) {
        this.nowBreak = nowBreak;
    }

    public void setScreenLocker(ScreenLocker screenLocker) {
        this.screenLocker = screenLocker;
    }

    public void setSoundPlayer(SoundPlayer soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

    public void setWorkTimeLeft(int workTimeLeft) {
        this.workTimeLeft = workTimeLeft;
    }

    public void setWorkTimeSet(int workTimeSet) {
        this.workTimeSet = workTimeSet;
    }

    public boolean isCycleComplete() {
        return cycleComplete;
    }

    public void setCycleComplete(boolean cycleComplete) {
        this.cycleComplete = cycleComplete;
    }

    public boolean isLockOnBreaktime() {
        return lockOnBreaktime;
    }

    public boolean isPlaySoundBreaktime() {
        return playSoundBreaktime;
    }

    public boolean isPlaySoundWorktime() {
        return playSoundWorktime;
    }

    public void setLockOnBreaktime(boolean lockOnBreaktime) {
        this.lockOnBreaktime = lockOnBreaktime;
    }

    public void setPlaySoundBreaktime(boolean playSoundBreaktime) {
        this.playSoundBreaktime = playSoundBreaktime;
    }

    public void setPlaySoundWorktime(boolean playSoundWorktime) {
        this.playSoundWorktime = playSoundWorktime;
    }

    public boolean isLockRepeatedly() {
        return lockRepeatedly;
    }

    public void setLockRepeatedly(boolean lockRepeatedly) {
        this.lockRepeatedly = lockRepeatedly;
    }
       
    
}
