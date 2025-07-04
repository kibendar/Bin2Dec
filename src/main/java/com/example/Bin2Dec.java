package com.example;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter up to 8 binary digits: ");
            String binaryString = scanner.nextLine().trim();

            if (binaryString.isEmpty()) {
                System.out.println("Error: No input provided");
                return;
            }

            if (binaryString.length() > 8) {
                System.out.println("Error: Input must be up to 8 binary digits");
                return;
            }

            for (int i = 0; i < binaryString.length(); i++) {
                char c = binaryString.charAt(i);
                if (c != '0' && c != '1') {
                    System.out.println("Error: Input must contain only 0s and 1s");
                    return;
                }
            }

            int decimal = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '1') {
                    decimal += 1 << (binaryString.length() - 1 - i);
                }
            }

            System.out.println("Binary: " + binaryString);
            System.out.println("Decimal: " + decimal);
        }
    }
}