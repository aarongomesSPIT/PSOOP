
/**
 * Write a description of class Bank here.
 *
 * @author Aaron Gomes
 * @version 01/04/26
 */

import java.io.*;
public class Bank
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073");
        
        System.out.print("Enter number of customers: ");
        int noCustomer = Integer.parseInt(din.readLine());
        
        for(int i = 0; i < noCustomer; i++){
            System.out.print("\nEnter details for customer " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = din.readLine();
            System.out.print("Account Type (Saving/Current): ");
            String accType = din.readLine();
            System.out.print("Interest Rate: ");
            float intRate = Float.parseFloat(din.readLine());
            System.out.print("Balance: ");
            float balance = Float.parseFloat(din.readLine());
            
            Customer 
        }
    }
}