
/**
 * Write a description of class CommercialVehicle here.
 *
 * @author Aaron Gomes
 * @version 18/03/26
 */

public class CommercialVehicle extends Vehicle
{
    //Overide parking fee
    double calculateParkingFee(){
        return 2 * BASE_PARKING_FEE;
    }
    CommercialVehicle(String VehicleNo){
        //Just pass the vehicle number to the parent
        super(VehicleNo);
    }
    
}