/**
 * Write a description of class Prob3 here.
 *
 * @brief Program to prompt the user and get input using the DataInputStream
 * and calulate the total value of the coins
 * @author Aaron Gomes
 * @version 04/02/26
 */
import java.io.*;

public class Prob3
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073\n");
        
        System.out.print("Enter amount due: ");
        //Store the input amout due in a double
        double amtDue = Double.parseDouble(din.readLine());
        
        System.out.print("Enter amount recieved: ");
        //Store the input amout recieved in a double
        double amtRecieved = Double.parseDouble(din.readLine());        
        
        //Calculate the change
        double change = amtRecieved - amtDue;
        System.out.println("\nChange to be returned: $" + change);
        
        int dollars = 0;
        int quaters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        
        dollars = (int) change;
        change = (change - dollars) * 10;
        
        quaters = (int)((int) change * 0.25);
        
        System.out.println("Dollars   : " + dollars);
        System.out.println("Quaters   : " + quaters);
        System.out.println("Dimes     : " + dimes);
        System.out.println("Nickels   : " + nickels);
        System.out.println("Pennies   : " + pennies);
    }
}