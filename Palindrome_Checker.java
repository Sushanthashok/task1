import java.util.Scanner;

public class Palindrome_Checker{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.println("------------------");

       
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

       
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            System.out.println(" It's a palindrome!");
        } else {
            System.out.println(" It's not a palindrome.");
        }

        scanner.close();
    }
}
