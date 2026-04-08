
/**
 * Write a description of class Machine here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */
abstract class Machine
{
    protected int machineId;
    protected String manufacturer;
    protected int operatingHours;
    
    //Declare the fuctionality here
    abstract void performOperation();
    abstract double calculateMaintenanceCost();
    
    void displayBasicInfo(){
        System.out.println("Machine ID: " + machineId);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Operating Hours: " + operatingHours);
        //The fuction is overrided according to the respective object type
        performOperation();
        System.out.println("Maintenance Cost: " + calculateMaintenanceCost());
    }
    
    Machine(int id, String manufacturer, int operatingHrs){
        this.machineId = id;
        this.manufacturer = manufacturer;
        this.operatingHours = operatingHrs;
    }
}