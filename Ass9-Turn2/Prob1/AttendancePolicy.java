
/**
 * Write a description of interface AttendancePolicy here.
 *
 * @author Aaron Gomes
 * @version 08/04/26
 */
public interface AttendancePolicy
{
    //Reads the attendance and can throw an error
    void readAttendance() throws Exception;
    boolean isAttendanceEligible();
}