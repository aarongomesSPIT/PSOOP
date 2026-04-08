/**
 * Write a description of class StudentCandidate here.
 * 
 * @brief Student Class and certifaction methods
 * @author Aaron Gomes
 * @version 08/04/26
 */
import java.io.*;
public class StudentCandidate implements CertificationRules, AttendancePolicy
{
    int id;
    float marks;
    float attendance;
    char grade;
    
    DataInputStream din = new DataInputStream(System.in);
    
    //Reads the StudentID
    void readId() throws Exception {
        System.out.print("Enter Student ID: ");
        id = Integer.parseInt(din.readLine());
    }
    
    //Reads the marks
    public void readMarks() throws Exception {
        System.out.print("Enter Marks: ");
        marks = Float.parseFloat(din.readLine());
    }
    
    //Reads the attendance
    public void readAttendance() throws Exception {
        System.out.print("Enter Attendance Percentage: ");
        attendance = Float.parseFloat(din.readLine());
    }
    
    //Checks if the attendance is sufficient
    public boolean isAttendanceEligible(){
        return (attendance >= 75);
    }
    
    //Computes the grade
    public void calculateGrade(){
        if (marks >= 85) grade = 'A';
        else if(marks >= 70) grade = 'B';
        else if(marks >= 50) grade = 'C';
        else grade = 'F';        
    }
    //Checks if the marks is sufficient
    public boolean isMarksEligible(){
        return (marks >= 50);
    }
    
    //Returns if the student is eligible to be certified
    String isCertified(){
        return (isMarksEligible() && isAttendanceEligible()) ? "ELIGIBLE" : "NOT ELIGIBLE";
    }
    //Outputs the report
    void displayReport(){
        System.out.println("\n--- Student Evaluation Report ---");
        System.out.println("Student ID     : " + id);
        calculateGrade();
        System.out.println("Grade          : " + grade);
        System.out.println("Attendance OK  : " + isAttendanceEligible());
        System.out.println("Marks Eligible : " + isMarksEligible());
        System.out.println("Certification  : " + isCertified());
    }
    
    //Initializes the students and reads the input and displays the report
    StudentCandidate() throws Exception {
        System.out.println("Aaron Gomes 2025300073");
        readId();
        readMarks();
        readAttendance();
        
        displayReport();
    }
}