
/**
 * Write a description of class TravelPolicy here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */
public class TravelPolicy extends Policy
{
    //The method of the Policy os overridded
    //Class is final to prevent overriding
    final double calculatePremium(){
        return BASE_PREMIUM + 3000;
    }
    
    TravelPolicy(int id, String type){
        super(id, type);
    }
}