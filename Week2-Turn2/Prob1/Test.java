
/**
 * Write a description of class Test here.
 * @breid Fixed the large volume of errors and cleaned the code
 * @author Aaron Gomes
 * @version 06/02/26
*/

import java.io.*; //java.io wasn't imported

public class Test //Classes should start with Uppercase
{
    public static void main() throws Exception{
        DataInputStream in = new DataInputStream(System.in);
        float total = 0; //Variable names should be small
        /* It should start from 0 */
        System.out.print("Enter a number: ");
        //Wrong quotes used and missiong semicolon
        float number1 = Float.valueOf(in.readLine());
        //number1 wasn't declared semicolon missing
        total = number1;
        System.out.print("Enter another number: ");
        //Wrong quotes used and missiong semicolon
        float number2 = Integer.parseInt(in.readLine()); //Variable datatype not declared
        total += number2; //Missing semicolon and variable was in upper case Also needed to add number2 not number1
        float average = total / (float) 2;
        System.out.print("Average = " + average); //Wrong semicolon and no usage of concatentaion
    }
}