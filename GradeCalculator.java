import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please provide your performance data (out of 100):");
            int numSubjects = 0;
            int totalMarks = 0;
            while (true) {
                System.out.print("Subject " + (numSubjects + 1) + ": ");
                int marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input detected. Please re-enter.");
                    continue;
                }
                totalMarks += marks;
                numSubjects++;
                if (numSubjects >= 5)
                    break;
            }
            
            double averagePercentage = (double) totalMarks / numSubjects;
            double totalPercentage = (averagePercentage / 100) * 100;
            
            char grade;
            if (totalPercentage >= 90) {
                grade = 'A';
            } else if (totalPercentage >= 80) {
                grade = 'B';
            } else if (totalPercentage >= 70) {
                grade = 'C';
            } else if (totalPercentage >= 60) {
                grade = 'D';
            } else if (totalPercentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            System.out.println("Your academic results:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);
        }
    }
}