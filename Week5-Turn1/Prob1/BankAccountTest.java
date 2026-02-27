/**
 * Write a description of class BankAccountTest here.
 *
 * @brief The main entry point for this banking program
 * @author Aaron Gomes
 * @version 25/02/26
 */

import java.io.*;
public class BankAccountTest
{
    public static void main(){
        System.out.println("Aaron Gomes 2025300073");
        DataInputStream din = new DataInputStream(System.in);
        //Creating 2 accounts
        BankAccount account1 = new BankAccount(1, "Sayali", "Savings", 10000);
        BankAccount account2 = new BankAccount(2, "Rahul", "Current", 12000);
        
        //Testing the account1
        account1.depositMoney(3000); //Depoit some money
        account1.withdrawMoney(50000000); // Withdraw an absurd amount
        account1.displayDetails(); // Get the account details
        
        System.out.println("-------------------------------------------------");
        //Testing the account2
        account2.depositMoney(2000); //Depoit some money
        account2.withdrawMoney(600000);  // Withdraw an absurd amount
        account2.displayDetails(); // Get the account details

    }
}