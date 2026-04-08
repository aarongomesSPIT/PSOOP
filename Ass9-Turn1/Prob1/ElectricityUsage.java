
/**
 * Write a description of interface ElectricityUsage here.
 *
 * @author Sparsh
 * @version 01/04/26
 */
public interface ElectricityUsage
{
    //Since I have used din.readline in the household consumer hence this can throw an error
    //Hence throws Exception
    void readElectricityUnits() throws Exception;
    void computeElectricityBill();
}