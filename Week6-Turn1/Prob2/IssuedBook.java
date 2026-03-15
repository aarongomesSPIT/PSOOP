/**
 * Write a description of class IssuedBook here.
 * 
 * @brief A class to hold details of issued books
 * @author Aaron Gomes
 * @version 06/03/26
 */
public class IssuedBook extends Book
{
    private double fine = 0.0;
    
    void calculateFine(){
        double totalFine = 0.0;
        if (issueDays > maxIssueLimit){ // If the book is issued for more than the max limit, calculate the fine
            totalFine = (issueDays - maxIssueLimit) * fine;
        }
        System.out.println("Fine Amount    : Rs. " + totalFine);
    }
    
    IssuedBook(String bookId, String bookTitle, boolean isReference, int issueDays, int issueLimit){
        super(bookId, bookTitle, isReference, issueDays, issueLimit); // Call the constructor of the parent class to initialize the book details
        if (isReference) { // If it's a reference book, set 5 rs
            fine = 5.0;
        }
        else {
            fine = 2.0;
        }
    }
}