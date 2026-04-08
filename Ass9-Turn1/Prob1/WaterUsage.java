
/**
 * Write a description of interface WaterUsage here.
 *
 * @author Sparsh          
 * @version 01/04/26
 */
public interface WaterUsage
{
    //Since I have used din.readline in the household consumer hence this can throw an error
    //Hence throws Exception
    void readWaterUnits() throws Exception;
    void computeWaterBill();
}