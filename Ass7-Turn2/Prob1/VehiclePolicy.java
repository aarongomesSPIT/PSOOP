
/**
 * Write a description of class VehiclePolicy here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */
public class VehiclePolicy extends Policy
{
    //The method of the Policy os overridded
    //Class is final to prevent overriding
    final double calculatePremium(){
        return BASE_PREMIUM + 1500;
    }
    
    VehiclePolicy(int id, String type){
        super(id, type);
    }
}