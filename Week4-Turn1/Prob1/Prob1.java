/**
 * Write a description of class Prob1 here.
 *
 * @brief Program to reverse a number using 
 * @author Aaron Gomes
 * @version 18/02/26
 */

import java.io.*;

public class Prob1
{
    public static void main() throws Exception {
        System.out.println("Aaron Gomes 2025300073");
        DataInputStream din = new DataInputStream(System.in); // Initialize the data input stream object
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(din.readLine()); //Get the Integer
        int rev = 0; //Reversed number
        while(num > 0){
            rev = rev * 10 + num % 10; // Get the digit and add it the reversed number
            num = num / 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}