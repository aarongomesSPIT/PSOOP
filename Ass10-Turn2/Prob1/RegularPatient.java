import java.util.*;

/**
 * Write a description of class RegularPatient here.
 *
 * @author Aaron Gomes
 * @version 10/04/26
 */
public class RegularPatient extends Patient implements ConsultationService, DiagnosticService
{
    double ConsultationCharge;
    double DiagnosticCharges;
    public void readConsultationCharges(){
        double charge = 0;
        while(true){
            try
            {
                System.out.print("Enter the Consultation Charges: ");
                charge = sc.nextDouble();
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Enter an number only.");
                ime.printStackTrace();
                sc.nextLine();
            }
                
            finally{
                if(charge > 0){
                    this.ConsultationCharge = charge;
                    break;
                }
                else System.out.println("The data entered is not valid. TRY AGAIN.");
            }
        }
    }
    public double getConsultationCharges(){
        return 0;
    }
    
    public void readDiagnosticCharges(){
        double charge = 0;
        while(true){
            try
            {
                System.out.print("Enter the Diagnostic Charges: ");
                charge = sc.nextDouble();

            }
            catch (InputMismatchException ime)
            {
                System.out.println("Enter an number only.");
                ime.printStackTrace();
            }
                
            finally{
                if(charge >= 0){
                    this.DiagnosticCharges = charge;
                    break;
                }
                else System.out.println("The Diagnostic Charges can't be negative. TRY AGAIN.");
            }
        }
    }
    
    // The charge cannot be accessed without using the getter
    public double getDiagnosticCharges(){
        return DiagnosticCharges;
    }
    
    // Calculates the bill and returns
    @Override
    double calculateBill(){
        return ConsultationCharge + DiagnosticCharges;
    }
    RegularPatient(){
        //Just get the input for a regular patient
        readPatientDetails();
        readConsultationCharges();
        readDiagnosticCharges();
    }
}