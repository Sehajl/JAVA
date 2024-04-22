// Qus. 1.4 Write a Java program to find and print the prime factors of a given number.
import java.util.Scanner;

public class exp1d {
    public static void main(String[] args) {
        System.out.println("Name:Raghav \n Roll No:2210997182");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Prime factors of " + number + " are:");
        printPrimeFactors(number);
    }

    public static void printPrimeFactors(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point, so we can skip one element (i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is a prime number greater than 2, print it
        if (n > 2) {
            System.out.print(n);
        }
    }
}
