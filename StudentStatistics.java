import java.util.Scanner;

/**
 * This program allows the user to input the assignment name.
 * @author (Nikesh)
 * @version (02/09/2023)
 */
public class StudentStatistics
{
    public static void main(String[] args){
    //F1: Allowing user to input the assignment name
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the Assignment Name: ");
    String assignmentName = input.nextLine();
    // F2: Allowing user to input students' marks
    double[] marks = new double[5]; // Assuming there are 5 students
    for (int i = 0; i < marks.length; i++) {
         System.out.print("Enter mark for student " + (i + 1) + ": ");
         double mark = input.nextDouble();
         
         // F3: Reporting and handling invalid input
         if (mark < 0 || mark > 30) {
                System.out.println("Invalid mark! Please enter a mark between 0 and 30.");
                i--; // Repeating the current iteration to reenter the mark
            } else {
                marks[i] = mark;
            }
        }
    }     
}
