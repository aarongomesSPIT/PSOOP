
/**
 * Write a description of class CuttingMachine here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */
public class CuttingMachine extends Machine implements RemoteMonitor,EnergyConsumer
{
    //The rates to be applied
    double MaintenanceCostRate = 15.5, EnergyCostRate = 4.2;
    void performOperation(){
        System.out.println("Cutting operation in progress");
    }
    double calculateMaintenanceCost(){
        return operatingHours * MaintenanceCostRate;
    }
    
    public void sendStatus(){
        System.out.println("Cutting machine status: ACTIVE");
    }
    
    public double calculateEnergyUsage(){
        return operatingHours * EnergyCostRate;
    }
    //Pass the values to the super class
    CuttingMachine(int id, String name, int optHrs){
        super(id, name, optHrs);
    }
}