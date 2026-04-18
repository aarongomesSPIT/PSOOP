/**
 * Write a description of class HumanPlayer here.
 *
 * @author Aaron Gomes
 * @version 17/04/26
 */
import java.util.*;
public class HumanPlayer extends Player
{
    public boolean isAlpha(String name) {
        // Check is a string contains only alphabets
        return name.matches("[a-zA-Z]+");
    }

    String name; // Stores the humans name
    Scanner sc = new Scanner(System.in);
    
    @Override
    int getGuess(){
        System.out.print(name + ", enter your choice (0 = Rock, 1 = Paper, 2 = Scissors): ");
        int input = 0;
        input = sc.nextInt();
        return input;
    }
    void win(){
        System.out.println(name + " wins!");
    }
    
    // tempName: Name to give the human while asking the name
    void getName(String tempName){
        String name = "";
        while(true){
            try
            {   
                System.out.print(tempName + ", enter your name: ");
                name = sc.nextLine();

                if(isAlpha(name)){
                    this.name = name;
                    break;
                }
                else System.out.println("The data entered is not a name. TRY AGAIN.");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    HumanPlayer(String tName){
        getName(tName);
    }
}