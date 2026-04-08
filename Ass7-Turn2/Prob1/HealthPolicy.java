
/**
 * Write a description of class HealthPolicy here.
 *
 * @author Aaron Gomes
 * @version 25/03/26
 */
public class HealthPolicy extends Policy
{
    //The method of the Policy os overridded
    double calculatePremium(){
        return BASE_PREMIUM + 2000;
    }
    
    HealthPolicy(int id, String type){
        super(id, type);
    }
}