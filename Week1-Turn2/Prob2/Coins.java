/**
 * Write a description of class Coins here.
 *
 * @brief Program to prompt the user and get input using the DataInputStream
 * and calulate the total value of the coins
 * @author Aaron Gomes
 * @version 04/02/26
 */
import java.io.*;
public class Coins
{
    public static void main() throws Exception{
        System.out.println("Aaron Gomes 2025300073\n");
        //Initialize the class DataInputStream for the input
        DataInputStream din = new DataInputStream(System.in);
        
        System.out.print("Enter number of pennies: ");
        //Store the Input of the pennies in an int
        int pennies = Integer.parseInt(din.readLine());
        
        System.out.print("Enter number of nickels: ");
        //Store the Input of the nickels in an int
        int nickels = Integer.parseInt(din.readLine());
        
        System.out.print("Enter number of dimes: ");
        //Store the Input of the dimes in an int
        int dimes = Integer.parseInt(din.readLine());
        
        System.out.print("Enter number of quaters: ");
        //Store the Input of the quaters in an int
        int quaters = Integer.parseInt(din.readLine());
        
        //The total variable is a double
        double total = 0.01 * pennies + 0.05 * nickels + 0.1 * dimes + 0.25 * quaters;
        System.out.println("Total value of coins: $" + total); 
    }
}