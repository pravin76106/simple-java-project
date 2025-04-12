package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print i stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}
