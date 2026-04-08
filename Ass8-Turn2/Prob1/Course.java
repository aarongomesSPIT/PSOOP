
/**
 * Write a description of class Course here.
 *
 * @author Aaron Gomes
 * @version 27/3/03/26
 */
abstract public class Course
{
    protected String courseCode;
    protected String instructorName;
    protected int duration;
    protected int score;
    
    protected void displayDetails(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Duration (weeks): " + duration);
        //Runtime polymorphism here to decide which object it belongs to
        evaluateStudent(score);
        boolean cert; //Save is a certificate is to be given
        if(this instanceof ProgrammingCourse){
                ((ProgrammingCourse)this).conductLiveSession();
                cert = ((ProgrammingCourse)this).issueCertificate(score);
            }
            else{
                ((ManagementCourse)this).conductLiveSession();
                cert = ((ManagementCourse)this).issueCertificate(score);
            }
        System.out.println(courseOutcome());
        System.out.println("Certificate Issued: " + cert);
    }
    
    // Abstarct classes to be defined later
    abstract void evaluateStudent(int score);
    abstract String courseOutcome();

    Course(String code, String name, int duration, int score){
        this.courseCode = code;
        this.instructorName = name;
        this.duration = duration;
        this.score = score;
    }
}