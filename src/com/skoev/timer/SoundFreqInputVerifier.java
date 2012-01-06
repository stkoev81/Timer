
package com.skoev.timer;
import javax.swing.*;


/**
 * This class is an input verifier for the sound frequency input 
 * ({@link TimerPanel#soundFrequency}). Used by {@link TimerPanel}.
 * 
 */

public class SoundFreqInputVerifier extends InputVerifier {
    private JLabel verifierLabel;
    /**
     * Sole constructor 
     * @param verifierLabel JLabel where a message to the user will be displayed
     * by this InputVerifier if the user's input is incorrect
     */
    public SoundFreqInputVerifier(JLabel verifierLabel) {
        this.verifierLabel = verifierLabel; 
    }    
     /**
     * Verifies the user input to a JComponent for which this verifier object 
     * has been assigned. If the method returns false, the user is not allowed
     * to advance focus out of that JComponent. 
     * 
     * @param input JComponent to be verified
     * @return true if the user's input is an integer between 20 and 3999 
     * inclusive, false
     * otherwise
     */
    
    @Override
    public boolean verify(JComponent input) {
        JTextField tf = (JTextField) input;
        boolean isInt;
        int i = -1; 
        try {
            i = Integer.parseInt(tf.getText());               
            isInt = true; 
        }
        catch (NumberFormatException e){
            isInt = false; 
        }

        if (isInt && i>=20 && i<=3999){
            verifierLabel.setText("");
            return true; 
        }
        else {
            verifierLabel.setText("Frequency must be an integer "
               + " between 20 and 3999. Correct and try again."); 
            return false; 
        }
    }
   
}

