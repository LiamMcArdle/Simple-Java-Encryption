/**
 * Liam McArdle
 * February 24, 2019
 * A simple encryption/decryption program that shifts char values to make an entirely different sentence.
 */
// Import the necessary libraries
import javax.swing.JOptionPane;

public class SimpleEncryption {

    public static void main(String args[]) {

        //Variables are defined and assigned to their relative values.
        String userInput = "";
        int shift = 0;
        int unicode1 = 0;
        int unicode2 = 0;
        char char1 = ' ';
        char char2 = ' ';
        String encryptDecrypt = "";

        encryptDecrypt = JOptionPane.showInputDialog("Would you like to like to encrypt or decrypt a sentence?"); //Determines whether the user would like to encrypt or decrypt.

        try { //Attempts to run the program without crashing.
            if (encryptDecrypt.equalsIgnoreCase("encrypt")) { //Completes the following task if "encrypt" is entered. (Also ignores cases)
                // Sentence is input by user and asks users how many characters over they would like it to be shifted.
                String originalPhrase = JOptionPane.showInputDialog("What is the sentence you would like to encrypt?");
                userInput = JOptionPane.showInputDialog("How many characters should we shift to encrypt the sentence?");
                shift = Integer.parseInt(userInput); //Parses the user's answer to an integer

                // Clears the console
                System.out.print('\u000C');

                String encryptedPhrase = "";
                    //Initializes a loop to shift the chars over by the user's desire.
                    for (int i = 0; i < originalPhrase.length(); i++) {
                    char1 = originalPhrase.charAt(i);
                    unicode1 = (int) char1;
                    unicode2 = unicode1 + shift; //Adds the shift to the user's input (which has been converted to integer format)
                    char2 = (char) unicode2;
                    encryptedPhrase = encryptedPhrase + char2;
                }

                //display the results
                JOptionPane.showMessageDialog(null,  "Done! The program has encrypted your phrase and here is the result: "  + encryptedPhrase + ". You're welcome :D", "GG wp", JOptionPane.PLAIN_MESSAGE); //Outputs the user's encrypted phrase.

            } else if (encryptDecrypt.equalsIgnoreCase("decrypt")) { //If the user wants to decrypt the sentence, then the following will be executed.

                String originalPhrase = JOptionPane.showInputDialog("What is the sentence you would like to decrypt?"); //Very similar to the encryption, but with a few tweaks.
                userInput = JOptionPane.showInputDialog("How many characters were shifted to encrypt the sentence?");
                shift = Integer.parseInt(userInput);

                // Clears the console
                System.out.print('\u000C');

                String decryptedPhrase = "";

                    for (int i = 0; i < originalPhrase.length(); i++) {
                    char1 = originalPhrase.charAt(i);
                    unicode1 = (int) char1;
                    unicode2 = unicode1 - shift; //Subtracts shift from the user's input instead of adding it.
                    char2 = (char) unicode2;
                    decryptedPhrase = decryptedPhrase + char2;
                }
                JOptionPane.showMessageDialog(null,  "Done! The program has decrypted your phrase and determined its meaning: "  + decryptedPhrase + ". You're welcome :D", "GG wp", JOptionPane.PLAIN_MESSAGE); //Outputs the user's decrypted phrase.
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sorry, something went wrong."); //If there is an problem throughout, the program will give this error and end.
            }
        }
    }

