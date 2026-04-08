
/**
 * Write a description of class ProgrammingCourse here.
 *
 * @author Aaron Gomes
 * @version 27/3/03/26
 */
public class ProgrammingCourse extends Course implements LiveSession, Certification
{
    @Override
    public void conductLiveSession(){
        System.out.println("Live coding session conducted");
    }
    
    @Override
    public boolean issueCertificate(int score){
        // Decide if a certificate is to be produced
        return (score >= 60) ? true : false;
    }
    
    @Override
    void evaluateStudent(int score){
        System.out.println("Programming Score: " + score);
    }
    
    @Override
    String courseOutcome(){
        return "Outcome: Practical coding skills ganned";
    }

    ProgrammingCourse(String code, String name, int duration, int score){
        super(code, name, duration, score);
    }
}