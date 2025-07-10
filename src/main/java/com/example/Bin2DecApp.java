package com.example;

import java.util.Scanner;

/**
 * Application for converting binary to decimal.
 */
public class Bin2DecApp {

  // field for DI(dependency injection)
  private final Convertor convertor;

  /**
   * Constructor for dependency injection.
   *
   * @param convertor the converter to use for binary to decimal conversion
   */
  public Bin2DecApp(Convertor convertor) {
    this.convertor = convertor;
  }

  /**
   * Runs the application to convert binary input to decimal.
   *
   * @param input the binary string to convert
   */
  public void run(String input) {
    int result = convertor.convertBinToDec(input);


    // output the result of conversion
    System.out.println(result);
  }

  /**
   * Main entry point of the application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Enter binary number: ");

      String input = scan.nextLine();

      // create object 'convert' for Convertor
      Convertor convert = new Bin2DecConvertor();

      // create object 'app' for use the method run()
      Bin2DecApp app = new Bin2DecApp(convert);

      app.run(input);
    }
  }
}

