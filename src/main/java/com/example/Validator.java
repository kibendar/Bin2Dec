package com.example;

public class Validator {

    public boolean validateByEmpty(String input) {     //Validate input if null
        if (input == null) {
            return true;
        } else {
            return false;
        }
    }


    public boolean validateByNumber(String input) {  //Validate input for number
        if ((!input.equals("1")) && (!input.equals("0"))) {
            return true;
        } else {
            return false;
        }

    }


}
