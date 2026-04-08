
/**
 * Write a description of class LearningPlatform here.
 *
 * @brief A program to check scores of students etc and give certificates
 * @author Aaron Gomes
 * @version 27/3/03/26
 */

import java.io.*;
public class LearningPlatform
{
    public static void main() throws Exception{
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Aaron Gomes 2025300073");
        
        System.out.print("Enter number of courses: ");
        int noCourses = Integer.parseInt(din.readLine());
        Course courses[] = new Course[noCourses];
        for(int i = 0; i < noCourses; i++){
            System.out.print("\nEnter course type (1—Programming, 2-Management): ");
            int type = Integer.parseInt(din.readLine());
            System.out.print("Course Code: ");
            String code = din.readLine();
            System.out.print("Instructor Name: ");
            String name = din.readLine();
            System.out.print("Duration (weeks): ");
            int duration = Integer.parseInt(din.readLine());
            System.out.print("Student Score: ");
            int score = Integer.parseInt(din.readLine());
            
            switch(type){
                case 1:
                    //Initailize the programming course object
                    courses[i] = new ProgrammingCourse(code, name, duration, score);
                    break;
                case 2:
                    //Initailize the management course object
                    courses[i] = new ManagementCourse(code, name, duration, score);
                    break;
                default:
                    System.out.println("Incorrect course type selected.");
                    break;
            }
        }
        
        System.out.println("---- COURSE REPORT ----");
        for(int i = 0; i < noCourses; i++){
            courses[i].displayDetails();
            System.out.println("---------------------");
        }
    }
}