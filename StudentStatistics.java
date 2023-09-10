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
    // F4: Printing assignment name and marks
    System.out.println("\nAssignment Name: " + assignmentName);
    System.out.print("Marks: ");
    for (double mark : marks) {
            System.out.print(mark + " ");
        }
    System.out.println();
    
    // F5: Finding and printing the highest and lowest marks
        double highestMark = marks[0];
        double lowestMark = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highestMark) {
                highestMark = marks[i];
            }
            if (marks[i] < lowestMark) {
                lowestMark = marks[i];
            }
        }
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);
        
    // F6: Calculating and Printing the Mean and Standard Deviation
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        double mean = sum / marks.length;
        
        double sumOfSquaredDifferences = 0;
        for (double mark : marks) {
            sumOfSquaredDifferences += Math.pow(mark - mean, 2);
        }
        double standardDeviation = Math.sqrt(sumOfSquaredDifferences / marks.length);
        
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
        
        input.close();
    }    
}
