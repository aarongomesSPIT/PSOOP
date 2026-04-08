/**
 * Write a description of class FactorySystem here.
 *
 * @author Aaron Gomes
 * @version 26/03/26
 */

import java.io.*;
public class FactorySystem
{
     public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073");
        System.out.print("Enter number of machines: ");
        int noMachine = Integer.parseInt(din.readLine());
        //Array of machines objects
        Machine machines[] = new Machine[noMachine];
        
        for(int i = 0; i < noMachine; i++){
            //Gets all the input required
            System.out.print("\nEnter machine type (1—Cutting, 2—Welding): ");
            int type = Integer.parseInt(din.readLine());
            System.out.print("Machine ID: ");
            int id = Integer.parseInt(din.readLine());
            System.out.print("Manufacturer: ");
            String manufacturer = din.readLine();
            System.out.print("Operating Hours: ");
            int opteratingHrs = Integer.parseInt(din.readLine());
            
            //Assign the values to the corresponding object according to the input type
            switch(type){
                case 1:
                    machines[i] = new CuttingMachine(id, manufacturer, opteratingHrs);
                    break;
                case 2:
                    machines[i] = new WeldingMachine(id, manufacturer, opteratingHrs);
                    break;
                default:
                    System.out.println("Option not found!");
                    break;
            };
        }
        System.out.println("\n---- Machine Report ----");
        for(int i = 0; i < noMachine; i++){
            machines[i].displayBasicInfo();
            //Check if the object is of which type and downcast it
            if(machines[i] instanceof CuttingMachine){
                ((CuttingMachine)machines[i]).sendStatus();
            }
            else{
                ((WeldingMachine)machines[i]).sendStatus();
            }
            System.out.println("-----------------------");
        }
    }
}