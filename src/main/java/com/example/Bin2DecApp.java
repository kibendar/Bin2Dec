package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Main class of project Bin2Dec
 **/
public class Bin2DecApp {

  // fields for DI(dependency injection)
  private final Convertor convertor;

  private final Bin2DecJsonResult jsonMapper;

  Input inputC = new Input();

  /**
   *Constructor for DI(dependency injection).
   **/
  public Bin2DecApp(Convertor convertor, Bin2DecJsonResult jsonMapper) {
    this.convertor = convertor;
    this.jsonMapper = jsonMapper;
  }

  /**
   *Method run() for work with method convertBinToDec() from Bin2DecConvertor.
   **/
  public void run(String input) {

    int result = convertor.convertBinToDec(input);

    // output the result of conversion
    jsonMapper.sendJsonDecimalResult(result);
  }

  /**
   * Main class.
   **/
  public static void main(String[] args) {
    Input inputC = new Input();

    String inputMain = inputC.inputBinary();

    // create object 'convert' for Convertor
    Convertor convert = new Bin2DecConvertor();

    Bin2DecJsonResult jsonMapper = new Bin2DecJsonResult(new ObjectMapper());

    // create object 'app' for use the method run()
    Bin2DecApp app = new Bin2DecApp(convert, jsonMapper);

    app.run(inputMain);
  }
}
