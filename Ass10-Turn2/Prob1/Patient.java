
/**
 * Write a description of class Patient here.
 *
 * @brief Basic Patient Class to handle patients
 * @author Aaron Gomes
 * @version 10/04/26
 */

import java.io.IOException;
import java.util.*;

public class Patient
{
    // function to check if a string contains only letters and hence it's a name
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }
    
    Scanner sc = new Scanner(System.in);
    int patientId;
    String patientName;
    void readPatientDetails(){
                
        int id = 0;
        while(true){
            try
            {
                System.out.print("Enter the patient Id: ");
                id = sc.nextInt();
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Enter an integer only.");
                ime.printStackTrace();
                sc.nextLine();
            }
                
            finally{
                if(id > 0){
                    this.patientId = id;
                    break;
                }
                else System.out.println("The data entered is not valid. TRY AGAIN.");
            }
        }
        String name = "";
        while(true){
            try
            {   
                sc.nextLine();
                System.out.print("Enter the Patient name: ");
                name = sc.nextLine();

                if(isAlpha(name)){
                    this.patientName = name;
                    break;
                }
                //Throw a custom error
                else throw new HealthExcept("The data entered is not a name. TRY AGAIN.");
            }
            catch(HealthExcept e){
                //Print the message of the error
                System.out.println(e.getMessage());
            }
        }
    }
    
    double calculateBill(){
        return 0;
    }
    
}