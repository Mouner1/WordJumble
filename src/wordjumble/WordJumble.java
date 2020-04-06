/*
 * Mouner Dabjan 
 * 4/6/2020
 * This program lists all the word possibilites from a set of letters entered by the user 
 */
package wordjumble;

import javax.swing.*;

/**
 *
 * @author User
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //getting the user's input 
        String input = JOptionPane.showInputDialog("Please enter your word");
        // calling the recursive method 
        jumbleWords(input, "");
        
    }

    //input parameters
    //word - the remaining letters in the word still to jumble
    //jumbLet - the letters already used to create
    //the jumbled word

    public static void jumbleWords(String word, String jumbLet) {
        int pos;
        String remainingLetters;
        String origWord = word;
        String origJumbledLetters = jumbLet;
        if (word.length() == 1) {
            System.out.println(jumbLet + word);
        } else {
            for (pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                        + origWord.substring(pos + 1, origWord.length());
                //recursive call to jumbleWords()
                jumbleWords(remainingLetters,
                        origJumbledLetters + origWord.charAt(pos));
            }
        }
    }
}
    
