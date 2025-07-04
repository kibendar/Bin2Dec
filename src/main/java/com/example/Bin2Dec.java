package com.example;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter up to 8 binary numbers by a space (press Enter to finish early):");
            String result = "";
            int count = 0;
            while (count < 8) {
                System.out.print("Enter binary number " + (count + 1) + ": ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    break;
                }
                // Проверка, что только 0 и 1
                boolean isBinary = true;
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (c != '0' && c != '1') {
                        isBinary = false;
                        break;
                    }
                }
                if (!isBinary) {
                    System.out.println("Error: Input must contain only 0s and 1s");
                    continue;
                }
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += input;
                count++;
            }
        }
    }
}