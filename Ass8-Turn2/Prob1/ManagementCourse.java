
/**
 * Write a description of class ManagementCourse here.
 *
 * @author Aaron Gomes
 * @version 27/3/03/26
 */
public class ManagementCourse extends Course implements LiveSession, Certification
{
    @Override
    public void conductLiveSession(){
        System.out.println("Live case-study discussion conducted");
    }
    
    //Ovveride this method
    @Override
    public boolean issueCertificate(int score){
        return (score >= 50) ? true : false;
    }
    
    @Override
    void evaluateStudent(int score){
        System.out.println("Management Score: " + score);
    }
    
    @Override
    String courseOutcome(){
        return "Outcome: Leadership and planning skills gained";
    }
    
    ManagementCourse(String code, String name, int duration, int score){
        super(code, name, duration, score);
    }
}