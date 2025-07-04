package com.example;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter up to 8 binary numbers by a space (press Enter to finish early):");
            int count = 0;
            while (count < 8) {
                System.out.print("Enter binary number " + (count + 1) + ": ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    break;
                }
            }
        }
    }
}