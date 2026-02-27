
/**
 * Write a description of class Prob2 here.
 * @brief Program to read cli args and split an integer into a sequence of digits
 * @author Aaron Gomes
 * @version 06/02/26
 */
public class Prob2
{
    public static void main(String args[]){
        System.out.println("Aaron Gomes 2025300073");

        int i = 0; //Iterator to iterate through the num
        while(args[0].length() > i){
            //Get the Character at index position i
            System.out.print(args[0].charAt(i) + " ");
            i++; //Increment the iterator
        }

    }
}