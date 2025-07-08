/**
 * Binary to Decimal Converter (Bin2Dec)
 * <p>
 * A simple console application that converts binary numbers to their decimal equivalents.
 * <p>
 * Features:
 * - Accepts up to 8 binary inputs per session
 * - Validates input to ensure only 0s and 1s are accepted
 * - Provides clear examples of valid input format
 * - Allows early exit by pressing Enter without input
 * - Displays conversion summary at the end
 * <p>
 * Usage:
 * 1. Run the program
 * 2. Enter binary numbers when prompted (for example; 1010)
 * 3. Press Enter to finish early or continue until 8 numbers
 * 4. View conversion summary
 * <p>
 * Note: Uses try-with-resources for proper resource management
 */
package com.example;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close Scanner
        // Ensures resources are released even if exceptions occur
        Validator validator = new Validator();

        try (Scanner scanner = new Scanner(System.in)) {
            // Welcome message and instructions for the user
            System.out.println("\n=== Binary to Decimal Converter ===");
            System.out.println("Examples of valid inputs: '1010' (equals 10), '1111' (equals 15)");
            System.out.println("You can convert up to 8 numbers in one session");
            System.out.println("(Press ENTER without typing to exit early)\n");
            System.out.println("Enter a binary number (0s and 1s only), (like 1010): ");

            int count = 0;

            while (count < 8) {

                System.out.print("\nBinary number " + (count + 1) + "/8: ");
                String input = scanner.nextLine().trim();

               if(validator.validateIf(input)){
                   continue;
               }

                count++;
            }

            if (count > 0) {
                System.out.println("\nSummary: Converted " + count + " numbers");
            }

        }
    }
}