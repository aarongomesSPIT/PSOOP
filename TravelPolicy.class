/**
 * Write a description of class Policy here.
 * 
 * @bried Base Class for the Policy
 * @author Aaron Gomes
 * @version 25/02/26
 */
public class Policy
{
    int policyId;
    String policyHolderName;
    String policyType; //Store the policy type seperatly
    final double BASE_PREMIUM = 5000;
    
    final void showPolicyRules(){
        System.out.println("Policy rules cannot be modified.");
        System.out.println("Policy ID : " + policyId);
        System.out.println("Policy Type : " + policyType);
        System.out.println("Final Premium : " + this.calculatePremium());
        System.out.println();
    }
    
    double calculatePremium(){
        return BASE_PREMIUM;
    }
    
    Policy(int id, String type){
        this.policyId = id;
        this.policyType = type;
    }
    
}