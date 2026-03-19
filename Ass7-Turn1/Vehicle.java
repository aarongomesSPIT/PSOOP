
/**
 * Write a description of class Vehicle here.
 *
 * @author Aaron Gomes
 * @version 18/03/26
 */
public class Vehicle
{
    final double BASE_PARKING_FEE = 50;
    String vehicleNo;
    double parkingFee;
    
    double calculateParkingFee(){
        parkingFee = BASE_PARKING_FEE;
        return parkingFee;
    }
    
    final void displayVehicleType(){
        //Check which child class it belongs to
        if(this instanceof ElectricVehicle) System.out.println("Vehicle Type: ElectricVehicle");
        else if(this instanceof CommercialVehicle) System.out.println("Vehicle Type: CommercialVehicle");
        else if(this instanceof PetrolVehicle) System.out.println("Vehicle Type: PetrolVehicle");
        else System.out.println("Vehicle Type: FuelVehicle");
        
        System.out.println("Registration No: " + vehicleNo);
        System.out.println("Parking Fee : " + calculateParkingFee());
        
    }
    
    Vehicle(String vehicleN){
        this.vehicleNo = vehicleN;
    }
}