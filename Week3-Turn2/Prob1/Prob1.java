
/**
 * Write a description of class Prob1 here.
 * @brief Program to calculate the frequency of an LCR circuit form the L & R values
 * taking the C as steps of 0.01 from 0.01
 * @author Aaron Gomes
 * @version 13/02/26
 */

import java.io.*;
public class Prob1
{
    public static void main() throws IOException {
        System.out.println("Aaron Gomes 2025300073");
        double L, R, C = 0.01; //Initalize the inductance as L, Capacitance as C and Resistance as R
        double steps = 0.01; // Steps of 0.1
        DataInputStream din = new DataInputStream(System.in); //Initalize the Scannner object
        System.out.print("Enter inductance L: ");
        L = Double.parseDouble(din.readLine()); //Get the L as double
        System.out.print("Enter resistance R: ");
        R = Double.parseDouble(din.readLine()); //Get the R as double
        
        
        System.out.println("C      Frequency");
        for(int i = 0; i < 10; i++){ //10 steps essentiallly
            double F = Math.sqrt(1/(L * C) - R*R / (4* C * C));
            System.out.println(C + "         " + F);
            C += steps;
        }
    }
}