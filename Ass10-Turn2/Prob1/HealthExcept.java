
/**
 * Write a description of class HealthExcept here.
 *
 * @brief A custom Health Exception class to handle some Exceptions
 * @author Aaron Gomes
 * @version 15/04/26
 */
public class HealthExcept extends Exception
{
    //The message of the Exception
    String msg;
    
    HealthExcept(String msg){
        //Pass the message to the Exception class
        super(msg);
        this.msg = msg;
    }
}