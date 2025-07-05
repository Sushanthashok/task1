import java.util.Scanner;
import java.util.Random;

public class pass_word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        
        System.out.print("Include numbers? (true/false): ");
        boolean includeNumbers = scanner.nextBoolean();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean includeSpecial = scanner.nextBoolean();

       
        String charPool = "";
        if (includeNumbers) charPool += numbers;
        if (includeLowercase) charPool += lowercase;
        if (includeUppercase) charPool += uppercase;
        if (includeSpecial) charPool += specialChars;

        
        if (charPool.isEmpty()) {
            System.out.println("No character types selected. Cannot generate password.");
            scanner.close();
            return;
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        System.out.println("Generated Password: " + password.toString());

        scanner.close();
    }
}
