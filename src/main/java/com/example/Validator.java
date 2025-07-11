package com.example;

public class Validator {


    private final String RED = "\u001B[31m";
    private final String RESET = "\u001B[0m";

    public boolean validateByEmpty(String input) {     //Validate input if null
        if (input == null || input.isEmpty()) {
            System.out.println(RED + "ERROR: Your number is empty, please write 0 or 1" + RESET);
            return true;
        } else {  // if user write normal number - program work is normal
            return false;
        }
    }

    public boolean validateByNumber(String input) {  //Validate input for number
        if (!input.matches("[01]+")) {
            System.out.println(RED + "ERROR: Invalid binary number, please write a valid binary number (0 or 1)" + RESET);
            return true;
        } else { // if user write 1 or 0, all normal
            return false;
        }
    }

    public boolean validateByString(String input) {
        if (!input.matches("\\d+")) {
            System.out.println(RED + "ERROR: You should write the numbers 0 and 1, not string or characters" + RESET);
            return true;
        } else {
            return false;
        }
    }


    public boolean validateByLength(String input) {
        if (input.length() != 8) {
            System.out.println(RED + "ERROR: Your number is too long or too small, please write 8 characters" + RESET);
            return true;
        } else {
            return false;
        }
    }

    public boolean validateIf(String input) {

        if (validateByEmpty(input)) {
            return true;
        }

        if (validateByString(input)) {
            return true;
        }

        if (validateByNumber(input)) {
            return true;
        }

        if (validateByLength(input)) {
            return true;
        }
        return false;
    }


}
