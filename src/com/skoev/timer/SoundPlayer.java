
package com.skoev.timer;
import javax.sound.sampled.*;

/**
 * Class responsible for storing the sound settings and playing a sound.
 * Used by {@link TimerControl}
 */
 
public class SoundPlayer {
    /**
     * Determines the kinds of sounds played by {@link #sound()}
     */
    private boolean useSampledAudio;
    /**
     * Determines the kinds of sounds played by {@link #sound()}
     */
    private boolean useToolkitBeep; 
    /**
     * Determines the kinds of sounds played by {@link #sound()}
     */
    private boolean useBeeper; 
    /**
     * Sound frequency in Hz for the {@link #soundSampledAudio()} method
     */
    private int soundFrequency;
    /**
     * Sound duration in milliseconds for the {@link #soundSampledAudio()} method
     */
    private int soundDuration; 
    
    public SoundPlayer(){
        useDefaults(); 
    }
    /**
     * Plays zero or more of three sounds, depending on the values of 
     * {@link #useSampledAudio}, {@link #useToolkitBeep}, and {@link #useBeeper}. 
     * The first one calls the {@link #soundSampledAudio()} method, the second one
     * calls the java.awt.Toolkit.getDefaultToolkit().beep() method, and the 
     * third one prints the the bell character ("\u0007") to standard output. 
     */
    public void sound(){
        if(useSampledAudio){
            soundSampledAudio(); 
        }
        if(useBeeper){
            System.out.print("\u0007");
            System.out.flush();
        }
        if (useToolkitBeep){
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }      
    /**
     * Plays a sound using the javax.sound.sampled package; the sound duration
     * and frequency are the values of {@link #soundDuration} and 
     * {@link #soundFrequency}
     */
    public void soundSampledAudio()  {
        byte[] buf = new byte[soundDuration*8];
        for (int i=0; i<buf.length; i++) {
            double angle = i / (8000.0 / soundFrequency) * 2.0 * Math.PI;
            buf[i] = (byte)(Math.sin(angle) * 80.0);
        }

        SourceDataLine sdl = null; 
        AudioFormat af =  new AudioFormat(8000f,8,1,true,false);   
        
        try {
            sdl = AudioSystem.getSourceDataLine(af);
            sdl.open(af);
        }
        catch ( LineUnavailableException lue){
            System.err.println("line unavailable");
        }
        sdl.start();
        sdl.write(buf,0,buf.length);
        sdl.drain();
        sdl.close();      
    }
    
    /**
     * Reset the sound settings to their default values. 
     */
    public final void useDefaults(){
        useSampledAudio = true; 
        useToolkitBeep = false; 
        useBeeper = false; 
        soundFrequency = 2000; 
        soundDuration = 150;
    }

    public int getSoundDuration() {
        return soundDuration;
    }

    public int getSoundFrequency() {
        return soundFrequency;
    }

    public boolean isUseBeeper() {
        return useBeeper;
    }

    public boolean isUseSampledAudio() {
        return useSampledAudio;
    }

    public boolean isUseToolkitBeep() {
        return useToolkitBeep;
    }

    public void setSoundDuration(int soundDuration) {
        this.soundDuration = soundDuration;
    }

    public void setSoundFrequency(int soundFrequency) {
        this.soundFrequency = soundFrequency;
    }

    public void setUseBeeper(boolean useBeeper) {
        this.useBeeper = useBeeper;
    }

    public void setUseSampledAudio(boolean useSampledAudio) {
        this.useSampledAudio = useSampledAudio;
    }

    public void setUseToolkitBeep(boolean useToolkitBeep) {
        this.useToolkitBeep = useToolkitBeep;
    }
}

    

