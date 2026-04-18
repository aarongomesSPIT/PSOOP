import java.util.*;

/**
 * Write a description of class InsuredPatient here.
 *
 * @author Aaron Gomes
 * @version 15/04/26
 */
public class InsuredPatient extends EmergencyPatient implements InsuranceService
{
    double InsuranceCharge;
    
    //Just calculate the bill
    @Override
    double calculateBill(){
        return ConsultationCharge + DiagnosticCharges + EmergencyCharge - this.InsuranceCharge;
    }
    
    public void readInsuranceCoverage(){
        double charge = 0;
        while(true){
            try
            {
                System.out.print("Enter the Insurance Coverage Amount: ");
                charge = sc.nextDouble();
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Enter an number only.");
                ime.printStackTrace();
                sc.nextLine();
            }
                
            finally{
                // Check if the charges are not negative
                if(charge >= 0){
                    this.InsuranceCharge = charge;
                    break;
                }
                else System.out.println("The Insurance Coverage can't be negative. TRY AGAIN.");
            }
        }
    }
    // Return the charge
    public double getInsuranceCoverage(){
        return InsuranceCharge;
    }
    
    InsuredPatient(){
        super();
        readInsuranceCoverage();
    }
}