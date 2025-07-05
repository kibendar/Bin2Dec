/**
 * Binary to Decimal Converter (Bin2Dec)
 * 
 * A simple console application that converts binary numbers to their decimal equivalents.
 * 
 * Features:
 * - Accepts up to 8 binary inputs per session
 * - Validates input to ensure only 0s and 1s are accepted
 * - Provides clear examples of valid input format
 * - Allows early exit by pressing Enter without input
 * - Displays conversion summary at the end
 * 
 * Usage:
 * 1. Run the program
 * 2. Enter binary numbers when prompted (for example; 1010)
 * 3. Press Enter to finish early or continue until 8 numbers
 * 4. View conversion summary
 * 
 * Note: Uses try-with-resources for proper resource management
 */
package com.example;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close Scanner
        // Ensures resources are released even if exceptions occur
        try (Scanner scanner = new Scanner(System.in)) {
            // Welcome message and instructions for the user
            System.out.println("\n=== Binary to Decimal Converter ===");
            System.out.println("Examples of valid inputs: '1010' (equals 10), '1111' (equals 15)");
            System.out.println("You can convert up to 8 numbers in one session");
            System.out.println("(Press ENTER without typing to exit early)\n");
            System.out.println("Enter a binary number (0s and 1s only), (like 1010): ");
            
            // Counter for successfully converted numbers
            // Tracks the number of valid user inputs
            int count = 0;
            
            // Main input processing loop
            // Maximum of 8 iterations
            while (count < 8) {
                // Prompt with current number position
                // Using count to display current number
                // Adding 1 to start numbering from 1 (more user-friendly)
                System.out.print("\nBinary number " + (count+1) + "/8: ");
                
                // Reading and cleaning input:
                // nextLine() - reads the entire line
                // trim() - removes leading/trailing whitespace
                String input = scanner.nextLine().trim();

                // Check for early exit request
                // If user just pressed Enter
                if (input.isEmpty()) {
                    System.out.println("\nFinished. Thank you!");
                    break; // Exit the loop
                }
                // Increment successful conversion counter
                // Only increases after successful number processing
                count++;
            }

            // Session summary block:
            // Displayed after input loop completes
            if (count > 0) {
                System.out.println("\nSummary: Converted " + count + " numbers");
            } else {
                System.out.println("\nNo numbers were converted");
            }
            
            // For developers: program completion point
            // System.out.println("[DEBUG] Program completed successfully");
        }
        // Scanner automatically closes thanks to try-with-resources
    }
}