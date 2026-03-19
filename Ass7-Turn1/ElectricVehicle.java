
/**
 * Write a description of class ElectricVehicle here.
 *
 * @author Aaron Gomes
 * @version 18/03/26
 */
public class ElectricVehicle extends FuelVehicle
{
    // Override the parking fee method
    double calculateParkingFee(){
        return BASE_PARKING_FEE - 10;
    }
    ElectricVehicle(String vehicleNo){
        //Just pass the vehicle number to the parent
        super(vehicleNo);
    }
}