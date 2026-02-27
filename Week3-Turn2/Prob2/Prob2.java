/**
 * Write a description of class Prob2 here.
 *
 * @brief Program to tally the votes of candidates from the input
 * @author Aaron Gomes
 * @version 13/02/26
 */
import java.io.*;
public class Prob2
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in); //Initialize the Data Input stream object
        System.out.println("Aaron Gomes 2025300073");
        System.out.println("Enter votes (1-5). Enter 0 to stop.");
        
        int candidate[] = {0, 0, 0, 0, 0, 0}; //Initalize the candidates array to 0,
        // assume that the number at index 5 indicates spoilt ballots
        int vote = -1;
        while(vote != 0){
            vote = Integer.parseInt(din.readLine());
            if(vote == 0) break;
            if(vote <=5 && vote >0){
                candidate[vote-1]++; //Increment the candidates vote
            }
            else{
                candidate[5]++; //Increament the spoilt ballots
            }
        }
        System.out.println("\nResults:");
        for(int i = 0; i < 5; i++){ //Print the outputs of the 5 candidates
            System.out.println("Candidate " + (i+1) + ": " + candidate[i]); 
        }
        System.out.println("Spoilt ballots: " + candidate[5]); //Outpu the spoilt ballots
    }
}