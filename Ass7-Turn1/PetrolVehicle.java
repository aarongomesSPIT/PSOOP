
/**
 * Write a description of class PetrolVehicle here.
 *
 * @author Aaron Gomes
 * @version 18/03/26
 */
public class PetrolVehicle extends FuelVehicle
{
    // Override the parking fee method
    double calculateParkingFee(){
        return BASE_PARKING_FEE + 30;
    }
    
    PetrolVehicle(String vehicleNo){
        //Just pass the vehicle number to the parent
        super(vehicleNo);
    }
}