
/**
 * Write a description of class UtilityBillingSystem here.
 *
 * @brief A program to calculate A users bill based on the units consumed
 * @author SPARSH
 * @version 01/04/26
 */

import java.io.*;
public class UtilityBillingSystem
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("sparsh 2025800065");
        
        System.out.print("Enter Consumer ID: ");
        int consumerId = Integer.parseInt(din.readLine());
        
        //Intialise the consumer
        HouseholdConsumer user = new HouseholdConsumer(consumerId);
    }
}