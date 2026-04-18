/**
 * Write a description of class Starter here.
 *
 * @author Aaron Gomes
 * @version 17/04/26
 */
import java.util.*;

public class Starter
{
    public static void main(){
        System.out.println("Aaron Gomes 2025300073");
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("\n--- Rock Paper Scissors Game ---\n" +
                               "1. Human vs Human\n" +
                               "2. Human vs Computer\n" +
                               "3. Computer vs Computer\n" +
                               "4. Exit\n" +
                               "Enter choice: ");
            int choice = 0;
            try{
                choice = sc.nextInt();
            }
            catch(InputMismatchException ime){
                System.out.println("Input integer only");
            }                   
            
            MyGame game; // Define a game
                
                switch(choice){
                    case 1:
                        HumanPlayer human1 = new HumanPlayer("Player 1"); //Assign temporary names to the humans
                        HumanPlayer human2 = new HumanPlayer("Player 2");
                        game = new MyGame(human1, human2); //Initalize the game with the players
                        break;
                    case 2:
                        HumanPlayer human = new HumanPlayer("Human"); // Call a human a human
                        ComputerPlayer computer = new ComputerPlayer();
                        game = new MyGame(human, computer);
                        break;
                    case 3:
                        // Computer vs itself
                        ComputerPlayer pc1 = new ComputerPlayer();
                        ComputerPlayer pc2 = new ComputerPlayer();
                        game = new MyGame(pc1, pc2);
                        break;
                    case 4:
                        System.out.println("Exiting the game... Goodbye!");
                        System.exit(0); // Just quit the java program
                        break;
                    default:
                        System.out.println("Invalid Choice Entered...");
                        System.exit(0);
                        break;
            }
        }
    }
}