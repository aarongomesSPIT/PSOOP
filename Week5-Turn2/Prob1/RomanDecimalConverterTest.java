/**
 * Write a description of class RomanDecimalConverterTest here.
 *
 * @brief The test class to convert input from roman to decimal and vice versa
 * @author Aaron Gomes
 * @version 27/02/26
 */

import java.io.*;
public class RomanDecimalConverterTest
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073");
        
        int nos = Integer.parseInt(din.readLine()); // Read the number of numbers to take as input
        for(int i = 0; i < nos; i++){
            String input = din.readLine(); // Get the input number
            RomanDecimalConverter converter = new RomanDecimalConverter();
            try{ // Check if the string is an integer
                converter.toRoman(Integer.parseInt(input));
            }
            catch(Exception e){ // The string is not an integer hence roman
                converter.toDecimal(input.toUpperCase()); // Converts the roman string to uppercase
            }
        }
    }
}