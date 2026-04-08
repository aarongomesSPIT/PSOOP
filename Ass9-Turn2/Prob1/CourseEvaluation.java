
/**
 * Write a description of interface CourseEvaluation here.
 *
 * @author Aaron Gomes
 * @version 08/04/26
 */
public interface CourseEvaluation
{
    //Reads the marks and can throw an error
    void readMarks() throws Exception;
    //Definition of the calculate the grade
    void calculateGrade();
}