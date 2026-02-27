
/**
 * Write a description of class Test here.
 *
 * @author Aaron Gomes
 * @version 04/02/26
 */
import java.io.*;

public class Test
{
    public static void main(String args[]) throws Exception{
        String name = "";
        System.out.println("Enter your name:");
        DataInputStream din = new DataInputStream(System.in);
        try{
            name = din.readLine();
            System.out.println("Welcome, " + name + "!!");
        }catch(Exception e){
            System.out.println(e);
        }
        
            din.readLine();
        int x = Integer.parseInt(din.readLine());
        System.out.println("Integer:" + x ); 
    }
}