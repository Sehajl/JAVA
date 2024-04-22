// Qus 1.2 Write a Java program to print Pascal's Triangle of n rows. Use nested loops to calculate the values.
public class exp1b {
    public static void main(String[] args) {
        System.out.println("Name:Raghav \n Roll No:2210997182");
        int n = 5; // number of rows
        for(int i = 0; i < n; i++) {
            int number = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
