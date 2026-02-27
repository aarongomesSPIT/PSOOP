
/**
 * Write a description of class Prob4 here.
 * Design a Java application that:
Accepts three opinions about Java
Prints:The first argument in uppercase
The second argument in lowercase
The third argument as-is
You may use toUpperCase(),toLowerCase()functions.Search on the internet is permitted
 * @brief
 * @author Aaron Gomes
 * @version (a version number or a date)
 */
public class Prob4
{
    public static void main(String args[]){
        
        System.out.println("Enter first option about Java:\n" + args[0]);
        System.out.println("Enter second option about Java:\n" + args[1]);
        System.out.println("Enter third option about Java:\n" + args[2] + "\n\n");
        
        System.out.println("Formatted Output:");
        System.out.println(args[0].toUpperCase()); //Converts to uppercase
        System.out.println(args[1].toLowerCase()); //Converts to lowercase
        System.out.println(args[2]);
    }
}