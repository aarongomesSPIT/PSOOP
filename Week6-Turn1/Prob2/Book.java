/**
 * Write a description of class Book here.
 *
 * @brief A definition for books
 * @author Aaron Gomes
 * @version 06/03/26
 */
public class Book
{
    protected String bookId;
    protected String title;
    protected int issueDays;
    static int maxIssueLimit = 14; // Default limit for non-reference books

    static boolean isReference;
    
    void issueBook(int maxDays){
        maxIssueLimit = maxDays; // Update the max issue limit for non-reference books
    }
    // Overloaded method to set max issue limit based on whether it's a reference book or not
    void issueBook(int maxDays, boolean isReferenceBook){
        if(isReferenceBook){ // If it's a reference book, set the max issue limit to 1
            maxIssueLimit = 1;
        }
        maxIssueLimit = maxDays;
    }
    
    void displayBookDetails(){
        System.out.println("--- Book Details ---\n" +
                            "Book ID        : " + bookId + "\n" +
                            "Title          : " + title + "\n" +
                            "Issue Days     : " + issueDays + "\n" +
                            "Reference Book : " + isReference + "\n" +
                            "Max Limit      : " + maxIssueLimit
        );
        
    }
    
    Book(String bookId, String bookTitle, boolean isReference, int issueDays, int issueLimit){
        this.bookId = bookId;
        this.title = bookTitle;
        this.isReference = isReference;
        this.issueDays = issueDays;
        issueBook(issueLimit, isReference); // Set the max issue limit based on whether it's a reference book or not
    }
}