package com.example;

public class Validator {

    public boolean validateByEmpty(String input) {     //Validate input if null
        if (input == null || input.isEmpty()) {
            System.out.println("ERROR: Your number is empty, please write 0 or 1");
            return true;
        } else {  // if user write normal number - program work is normal
            return false;
        }
    }


    public boolean validateByNumber(String input) {  //Validate input for number
        if ((!input.equals("1")) && (!input.equals("0")) ) {
            System.out.println("ERROR: Invalid binary number, please write a valid binary number (0 or 1)");
            return true;

        } else { // if user write 1 or 0, all normal
            return false;
        }

    }

    public boolean validateByString(String input) {
        if(!input.matches("\\d+")){
            System.out.println("ERROR: You should write the numbers 0 and 1, not string or characters");
            return true;
        }else {
            return false;
        }
    }


}
