package com.example;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    Validator validator = new Validator();

    public String inputBinary() {
        String input = "";

        System.out.println("Input binary number(up to 8 characters): ");



        try {
            while(true) {


                String unCkeckedInput = scanner.nextLine();

                if(validator.validateIf(unCkeckedInput)){

                }else {
                    input = unCkeckedInput.toLowerCase();
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("throws exeption");
        }



        return input;
    }
}
