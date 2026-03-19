/**
 * Write a description of class Parking here.
 *
 * @brief The main test class
 * @author Aaron Gomes
 * @version 18/03/26
 */

import java.io.*;
public class Parking
{
    public static void main() throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073");
        System.out.print("Enter number of vehicles: ");
        int noOfVehicles = Integer.parseInt(din.readLine());
        
        Vehicle vehicle[] = new Vehicle[noOfVehicles]; //Create an array of vehicles
        for(int i = 0; i < noOfVehicles; i++){
            System.out.println("1.Electric 2.Petrol 3.Commercial");
            int opt = Integer.parseInt(din.readLine());
            System.out.print("Enter Registration No: ");
            String regNo = din.readLine();

            switch(opt){
                case 1:
                    vehicle[i] = new ElectricVehicle(regNo); //Assign it to child class
                    break;
                case 2:
                    vehicle[i] = new PetrolVehicle(regNo);
                    break;
                case 3:
                    vehicle[i] = new CommercialVehicle(regNo);
                    break;
                default:
                    System.out.println("Option not found");
                    break;
            }
        }
        
        System.out.println("--- Parking Fee Details ---");
        for(int i = 0; i < noOfVehicles; i++){
            //First calculate the parking fee
            vehicle[i].calculateParkingFee();
            //Then only print the output
            vehicle[i].displayVehicleType();
            System.out.println();
        }
    }
}