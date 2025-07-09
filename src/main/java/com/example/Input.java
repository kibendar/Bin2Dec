package com.example;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String inputBinary() {
        String input = "";

        System.out.println("Input binary number(up to 8 characters): ");

        try {
            String unCkeckedInput = scanner.nextLine();
           if(unCkeckedInput.length() > 8) {
               return "Input is too large";
           }

           if(unCkeckedInput.length() <= 0) {
               return "Input is too small";
           }

           input = unCkeckedInput.toLowerCase();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("throws exeption");
        }


        return input;
    }
}
