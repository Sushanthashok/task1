import java.util.Scanner;

public class temperature_converter{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");

        
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

      
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next();

        double convertedTemperature;
        String convertedUnit;

        if (unit.equalsIgnoreCase("C")) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            convertedUnit = "Fahrenheit";
            System.out.printf("%.2f Celsius is equal to %.2f %s.%n",
                    temperature, convertedTemperature, convertedUnit);
        } else if (unit.equalsIgnoreCase("F")) {
            convertedTemperature = (temperature - 32) * 5 / 9;
            convertedUnit = "Celsius";
            System.out.printf("%.2f Fahrenheit is equal to %.2f %s.%n",
                    temperature, convertedTemperature, convertedUnit);
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}

