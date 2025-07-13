package com.example;

/*
 * 'ASCII trick' mean that every character has his own ASCII code.
 * We use '0' and '1', which have code 48 and 49.
 * So (c - '0') mean that when we have 0 in c in for-each loop, we get (48 - 48 = 0).
 * In the case, when char '1', we have (49 - 48 = 1).
 *  */
public class Bin2DecConvertor implements Convertor {

  @Override
  // method for conversion from binary to decimal
  public int convertBinToDec(String input) {

    // variable to convert binary from decimal
    int decimal = 0;

    // get parameter 'input', which contain a string of binary digits
    // for-each for iteration of array of characters, which get from the string
    for (char c : input.toCharArray()) {

      // formula with ASCII trick*
      decimal = decimal * 2 + (c - '0');
    }

    // return converted digits to decimal
    return decimal;
  }
}
