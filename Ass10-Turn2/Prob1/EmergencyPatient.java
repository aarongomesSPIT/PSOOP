import java.util.*;

/**
 * Write a description of class EmergencyPatient here.
 *
 * @author Aaron Gomes
 * @version 10/04/26
 */
public class EmergencyPatient extends RegularPatient
{
    double EmergencyCharge;
    @Override
    double calculateBill(){
        return ConsultationCharge + DiagnosticCharges + EmergencyCharge;
    }
    
    public void readEmergencyCharges(){
        double charge = 0;
        while(true){
            try
            {
                System.out.print("Enter the Emergency Charges: ");
                charge = sc.nextDouble();
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Enter a number only.");
                ime.printStackTrace();
                sc.nextLine();
            }
                
            finally{
                if(charge >= 0){
                    this.EmergencyCharge = charge;
                    break;
                }
                else System.out.println("The Emergency Charges can't be negative. TRY AGAIN.");
            }
        }
    }
    public double getEmergencyCharges(){        
        return EmergencyCharge;
    }

    EmergencyPatient(){
        super();
        readEmergencyCharges();
    }
}