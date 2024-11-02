import java.util.Scanner;

public class CSGradeCalulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Grade Calculator!");
        System.out.println("Are you ready to calculate some grades? Let's go, Hatters! ");

        // Asking the user how many grades they want to input
        System.out.print("Enter the number of grades you want to calculate: ");
        int numberOfGrades = scanner.nextInt();

        // Validating that the number of grades is positive
        while (numberOfGrades <= 0) {
            System.out.println("Oops! You need at least one grade. Try again.");
            System.out.print("Enter the number of grades you want to calculate: ");
            numberOfGrades = scanner.nextInt();
        }

        // Creating an array to store the grades
        double[] grades = new double[numberOfGrades];
        double sum = 0;

        // Collecting grades from the user using a loop
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();

            // Validating that the grade is between 0 and 100
            while (grade < 0 || grade > 100) {
                System.out.println("Invalid grade! Grades should be between 0 and 100. Try again.");
                System.out.print("Enter grade " + (i + 1) + ": ");
                grade = scanner.nextDouble();
            }

            grades[i] = grade;  // Storing the grade
            sum += grade;       // Adding to the sum
        }

        //  Calculating the average
        double average = sum / numberOfGrades;

        //  Displaying the result
        System.out.printf("All done! Your average grade is: %.2f %n", average);

        // Extra feedback on performance
        if (average >= 90) {
            System.out.println("Wow! You're acing it! Keep up the awesome work! ");
        } else if (average >= 75) {
            System.out.println("Good job! You're doing well, just a little more push! ");
        } else if (average >= 60) {
            System.out.println("Not bad, but let's aim higher next time! You've got this! ");
        } else {
            System.out.println("Don't worry! Practice makes perfect. You can do better next time! ");
        }

        // Closing the scanner
        scanner.close();
        
        System.out.println("Go Hatters!!");
        System.out.println("Program by: [Stephen Peprah Wereko]");
    }
}
