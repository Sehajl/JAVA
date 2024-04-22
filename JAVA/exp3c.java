// Qus 3.3 Write a program that converts an amount in one currency to another based on the user's choice. The program should prompt the user to enter the amount, the source currency, and the target currency (e.g., USD to EUR). Use a switch-case statement to handle different currency conversions.
import java.util.Scanner;

public class exp3c {
    public static void main(String[] args) {
        System.out.println("Name:Raghav \n Roll No:2210997182");
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter amount, source currency, and target currency
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter the source currency (e.g., USD, EUR, GBP): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., USD, EUR, GBP): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        scanner.close();

        // Convert amount
        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        // Print the result
        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
    }

    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double conversionRate;

        // Define conversion rates
        switch (sourceCurrency) {
            case "USD":
                switch (targetCurrency) {
                    case "USD":
                        conversionRate = 1;
                        break;
                    case "EUR":
                        conversionRate = 0.85;
                        break;
                    case "GBP":
                        conversionRate = 0.73;
                        break;
                    default:
                        System.out.println("Unsupported target currency");
                        return 0;
                }
                break;
            case "EUR":
                switch (targetCurrency) {
                    case "USD":
                        conversionRate = 1.18;
                        break;
                    case "EUR":
                        conversionRate = 1;
                        break;
                    case "GBP":
                        conversionRate = 0.86;
                        break;
                    default:
                        System.out.println("Unsupported target currency");
                        return 0;
                }
                break;
            case "GBP":
                switch (targetCurrency) {
                    case "USD":
                        conversionRate = 1.37;
                        break;
                    case "EUR":
                        conversionRate = 1.16;
                        break;
                    case "GBP":
                        conversionRate = 1;
                        break;
                    default:
                        System.out.println("Unsupported target currency");
                        return 0;
                }
                break;
            default:
                System.out.println("Unsupported source currency");
                return 0;
        }

        return amount * conversionRate;
    }
}
