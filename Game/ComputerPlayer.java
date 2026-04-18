
/**
 * Write a description of class ComputerPlayer here.
 *
 * @breif Implements basic random number guesses for the computer
 * @author Aaron Gomes
 * @version 17/04/26
 */

public class ComputerPlayer extends Player
{
    @Override
    int getGuess(){
        // Math.random() returns a random number [0,1)
        // Hence, Generates a random integer between 0 to 2
        int num = (int)(Math.random() * 3);
        System.out.println("Computer chooses: " + num);
        return num;
    }
    void win(){
        System.out.println("Computer wins!");
    }
}