package com.example;

import java.util.Scanner;

public class Bin2DecApp {

  // field for DI(dependency injection)
  private final Convertor convertor;

  // constructor for DI(dependency injection)
  public Bin2DecApp(Convertor convertor) {
    this.convertor = convertor;
  }

  // method run() for work with method convertBinToDec() from Bin2DecConvertor
  public void run(String input) {
    int result = convertor.convertBinToDec(input);

    // output the result of conversion
    System.out.println(result);
  }

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

