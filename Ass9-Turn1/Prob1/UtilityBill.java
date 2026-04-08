
/**
 * Write a description of interface UtilityBill here.
 * 
 * @brief A interface which uses Multiple inheritance
 * @author Sparsh
 * @version 01/04/26
 */
public interface UtilityBill extends WaterUsage, ElectricityUsage
{
    //Interface which extends the water and electricity usage
    //It also add its own method below
    void displayTotalBill();
}