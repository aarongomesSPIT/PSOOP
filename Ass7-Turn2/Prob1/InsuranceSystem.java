/**
 * Write a description of class InsuranceSystem here.
 *
 * @brief Insurance Application
 * @author Aaron Gomes
 * @version 26/03/26
 */

import java.io.*;
public class InsuranceSystem
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073");
        
        System.out.print("Enter number of policies: ");
        int noPolicies = Integer.parseInt(din.readLine());
        //Create an array of policies of Policy class
        Policy policies[] = new Policy[noPolicies];
        
        for(int i = 0; i < noPolicies; i++){
            System.out.println("1.Health 2.Senior 3.Vehicle 4.Travel ");
            int opt = Integer.parseInt(din.readLine());
            System.out.print("Enter policy ID: ");
            int polId = Integer.parseInt(din.readLine());
            
            // According to the option selected create the respective policy
            switch(opt){
                case 1:
                    policies[i] = new HealthPolicy(polId, "HealthPolicy");
                    break;
                case 2:
                    policies[i] = new SeniorCitizenPolicy(polId, "SeniorCitizenPolicy");
                    break;
                case 3:
                    policies[i] = new VehiclePolicy(polId, "VehiclePolicy");
                    break;
                case 4:
                    policies[i] = new TravelPolicy(polId, "TravelPolicy");
                    break;
            }
        }
        
        System.out.println("\n--- Policy Premium Details ---");
        for(int i = 0; i < noPolicies; i++){
            //Get the output of the saved polices
            policies[i].showPolicyRules();
        }
    }
}