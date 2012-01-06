
package com.skoev.timer;
import javax.swing.*;
/**
 * This class is an input verifier for the work time and break time inputs 
 * ({@link TimerPanel#workTimeInput} and {@link TimerPanel#breakTimeInput}). 
 * Used by {@link TimerPanel}.
 */
public class TimeInputVerifier extends InputVerifier {
    private JLabel verifierLabel;
      /**
     * Sole constructor 
     * @param verifierLabel JLabel where a message to the user will be displayed
     * by this InputVerifier if the user's input is incorrect
     */
    public TimeInputVerifier(JLabel verifierLabel) {
        this.verifierLabel = verifierLabel; 
    }   
    
     /**
     * Verifies the user input to a JComponent for which this verifier object 
     * has been assigned. If the method returns false, the user is not allowed
     * to advance focus out of that JComponent. 
     * 
     * @param input JComponent to be verified
     * @return true if the user's input is a non-negative integer, false 
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

        if (isInt && i>=0){
            verifierLabel.setText("");
            return true; 
        }
        else {
            verifierLabel.setText("Time value must be an integer and it"
               + " must be non-negative. Correct and try again."); 
            return false; 
        }
    }
}

