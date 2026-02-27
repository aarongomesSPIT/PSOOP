/**
 * Write a description of class Prob3 here.
 * @brief Program to 2 times in military format and calculate the time difference between them
 * @author Aaron Gomes
 * @version 06/02/26
 */

import java.io.*;
public class Prob3
{
    public static void main() throws Exception{
        System.out.println("Aaron Gomes 2025300073");
        //Initalize the data input stream as din
        DataInputStream din = new DataInputStream(System.in);
        System.out.print("Please enter the first time: ");
        String time1 = din.readLine(); //Read the first time
        int hours1 = Integer.parseInt(time1.substring(0,2)); //Read the 1st 2 digits and convert to int
        int mins1 = Integer.parseInt(time1.substring(2)); //Read the last 2 digits and convert to int
        
        int totalMins1 = hours1 * 60 + mins1; //Convert the time into mins only
        
        System.out.print("Please enter the second time: ");
        String time2 = din.readLine();
        int hours2 = Integer.parseInt(time2.substring(0,2)); //Read the 1st 2 digits and convert to int
        int mins2 = Integer.parseInt(time2.substring(2)); //Read the last 2 digits and convert to int
        
        int totalMins2 = hours2 * 60 + mins2; //Convert the time into mins only
        
        int difference = totalMins2 - totalMins1; //Caluate the time difference between the 2nd time and the 1st time
        
        //Add 24 hrs to the time if a negative value if generated
        difference += (difference < 0) ? 1440 : 0;
        
        System.out.println((int)(difference / 60) + " hours " + difference % 60 + " minutes");
    }
}