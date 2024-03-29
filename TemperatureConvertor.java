import java.util.Scanner;

public class TemperatureConvertor {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("*************** WELCOME TEMPERATURE CONVERTER ***************");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter Your Choice");
        System.out.println("-----------------");
        System.out.println("Enter--> '1' to convert form Celcius to Fahrenheit.");
        System.out.println("Enter--> '2' to convert form Fahrenheit to Celcius.");
        int choice = scan.nextInt();

        double temperature = 0.0;
        double converted = 0.0;

        if (choice == 1) {
            System.out.println("Enter the temperature in Celcius.");
            temperature = scan.nextDouble();
            converted = 9 / 5.0 * temperature + 32;
            System.out.println("Temperature in Fahrenheit= " + converted);
            System.out.println("-------------------------------------------------------------");
            System.out.println("***Thank You For Using***");
            System.out.println("-------------------------");
        }

        else if (choice == 2) {
            System.out.println("Enter the temperature in Fahrenheit.");
            temperature = scan.nextDouble();
            converted = 5 / 9.0 * (temperature - 32);
            System.out.println("Temperature in Celcius= " + converted);
            System.out.println("-------------------------------------------------------------");
            System.out.println("***Thank You For Using***");
            System.out.println("-------------------------");
        }

        else
            System.out.println("Wrong Input. Please try again...");
    }
}