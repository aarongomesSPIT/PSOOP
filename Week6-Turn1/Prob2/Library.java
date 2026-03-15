/**
 * Write a description of class Library here.
 *
 * @brief A library app to calculate the fine and check if its a refernce book etc
 * @author Aaron Gomes
 * @version 06/03/26
 */

import java.io.*;
public class Library
{
    public static void main() throws IOException {
        System.out.println("Aaron Gomes 2025300073");
        DataInputStream din = new DataInputStream(System.in);
        
        System.out.print("Enter Book ID: ");
        String bookId = din.readLine();
        System.out.print("Enter Book Title: ");
        String bookTitle = din.readLine();
        System.out.print("Is Reference Book? (true/false): ");
        boolean isReference = Boolean.parseBoolean(din.readLine());
        System.out.print("Enter Issue Days: ");
        int issueDays = Integer.parseInt(din.readLine());
        System.out.print("Change Max Issue Limit? (yes/no): ");
        String changeMaxIssueLimit = din.readLine();
        
        int issueLimit = 14;
        if ("yes".equalsIgnoreCase(changeMaxIssueLimit.trim())) { // trims all spaces and is not case sensitive
            System.out.print("Enter New Limit: ");
            issueLimit = Integer.parseInt(din.readLine());
        }
        System.out.println();
        // Create an instance of IssuedBook with the provided details
        IssuedBook book = new IssuedBook(bookId, bookTitle, isReference, issueDays, issueLimit);

        book.displayBookDetails(); // Display the details of the issued book
        book.calculateFine(); // Calculate and display the fine if applicable
        
    }
}