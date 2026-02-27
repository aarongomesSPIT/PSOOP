/**
 * Write a description of class BankAccount here.
 * 
 * @brief A simple class for the bank account system
 * @author Aaron Gomes
 * @version 25/02/26
 */

import java.io.*;

public class BankAccount
{
    int accountNo;
    String accountName;
    String accountType;
    double balance;
    
    // Constructor for initializing the account
    BankAccount(int no, String name, String type, double bal) {
        accountNo = no;
        accountName = name;
        accountType = type;
        balance = bal;
    }
    
    //Method to deposit money
    void depositMoney(double deposit){
        balance += deposit;
        System.out.println("New balance is: " + balance);
    }
    
    //Method to withdraw money
    void withdrawMoney(double withdraw){
        if(withdraw <= balance){
            balance -= withdraw;
            System.out.println("New balance is: " + balance);
        }
        else System.out.println("Insufficient funds, You are broke");
    }
    
    //Print out the account details 
    void displayDetails(){
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
    
}