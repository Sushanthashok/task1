import java.util.Scanner;

public class Grade_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");

        
        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

       
        double[] grades = new double[numGrades];

        
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        
        double sum = 0;
        for (int i = 0; i < numGrades; i++) {
            sum += grades[i];
        }

       
        double average = sum / numGrades;

        
        System.out.printf("Average grade: %.2f%n", average);

        scanner.close();
    }
}
