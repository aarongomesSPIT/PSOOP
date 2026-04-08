
/**
 * Write a description of class WeldingMachine here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */
public class WeldingMachine extends Machine implements RemoteMonitor,EnergyConsumer
{
    //The rates to be applied
    double MaintenanceCostRate = 18, EnergyCostRate = 5.5;
    void performOperation(){
        System.out.println("Welding operation in progress");
    }
    double calculateMaintenanceCost(){
        return operatingHours * MaintenanceCostRate;
    }
    
    public void sendStatus(){
        System.out.println("Welding machine status: ACTIVE");
    }
    
    public double calculateEnergyUsage(){
        return operatingHours * EnergyCostRate;
    }
    
    //Pass the values to the super class
    WeldingMachine(int id, String name, int optHrs){
        super(id, name, optHrs);
    }
}