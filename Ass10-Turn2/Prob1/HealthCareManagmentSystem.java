
/**
 * Write a description of class HealthCareManagmentSystem here.
 *
 * @brief Program for a Hosptial Management system
 * @author Aaron Gomes
 * @version 10/04/26
 */

import java.util.*;
public class HealthCareManagmentSystem
{
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aaron Gomes 2025300073");
        System.out.print("Select Patient Type:\n" +
                           "1. Regular Patient\n" +
                           "2. Emergency Patient\n" +
                           "3. Insured Patient\n" +
                           "Choice: ");
        int choice = 0;
        try{
            choice = sc.nextInt();
        }
        catch(InputMismatchException ime){
            System.out.println("Enter an integer only.");
        }
        // Initialize a patient
        Patient patient = new Patient();
        switch(choice){
            // Set the patient type according to the choice selected
            case 1:
                //Regular patient
                patient = new RegularPatient();
                break;
            case 2:
                //Emergency patient builds on Regular patient
                patient = new EmergencyPatient();
                break;
            case 3:
                // Insured Patient builds on Emergency patient
                patient = new InsuredPatient();
                break;
            default:
                System.out.println("Invalid Choice Entered...");
                // Exit the program with a success
                System.exit(0);
                break;
        }
        
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Patient ID   : " + patient.patientId);
        System.out.println("Patient Name : " + patient.patientName);
        System.out.println("Total Payable Amount: Rs. " + patient.calculateBill());
    }
}