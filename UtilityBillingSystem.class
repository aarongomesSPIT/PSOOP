/**
 * Write a description of class HouseholdConsumer here.
 *
 * 
 * @author sparsh
 * @version 01/04/26
 */

import java.io.*;
public class HouseholdConsumer implements UtilityBill
{
    //Needed here as I want to read the consumption units
    DataInputStream din = new DataInputStream(System.in);
    int consumerId;
    float elecUnits;
    float elecBill;
    float waterUnits;
    float waterBill;
    float totalBill;
    
    //This can throw Exceptions
    public void readElectricityUnits() throws Exception {
        System.out.print("Enter Electricity Units: ");
        elecUnits = Float.parseFloat(din.readLine());
    }
    
    //Calculations performed here
    public void computeElectricityBill(){
        elecBill = elecUnits * 5;
    }

    //This can throw Exceptions
    public void readWaterUnits() throws Exception{
        System.out.print("Enter Water Units: ");
        waterUnits = Float.parseFloat(din.readLine());
    }
    
    //Calculations performed here
    public void computeWaterBill(){
         waterBill = waterUnits * 2;
    }
    
    public void displayTotalBill(){
        totalBill = waterBill + elecBill;
        System.out.println("\n--- Utility Bill ---");
        System.out.println("Consumer ID      : " + consumerId);
        System.out.println("Electricity Bill : " + elecBill);
        System.out.println("Water Bill       : " + waterBill);
        System.out.println("Total Bill       : " + totalBill);
    }
    
    
    //This can also throw Exceptions as Im reading here
    HouseholdConsumer(int id) throws Exception {
        this.consumerId = id;
        this.readElectricityUnits();
        this.readWaterUnits();
        this.computeElectricityBill();
        this.computeWaterBill();
        this.displayTotalBill();
    }
}