
/**
 * Write a description of class SeniorCitizenPolicy here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */
public class SeniorCitizenPolicy extends HealthPolicy
{
    //The method of the Policy os overridded
    //Class is final to prevent overriding
    final double calculatePremium(){
        return BASE_PREMIUM + 4000;
    }
    
    SeniorCitizenPolicy(int id, String type){
    
        super(id, type);
    }
}