package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;

/**
 *Class for shering the result on convension in JSON format.
 *
 *@class Bin2DecJsonResult
 **/
@AllArgsConstructor
public class Bin2DecJsonResult {

  private final ObjectMapper objectMapper;

  /**
   *Method for shering the result on convension in JSON format.
   *
   *@param input get integer value of decimal result
   *@return JSON
   **/
  public String sendJsonDecimalResult(int input) {

    try {

      Bin2DecJsonResponse response = new Bin2DecJsonResponse(input, "Success");

      return objectMapper.writeValueAsString(response);
    } catch (Exception e) {
      Bin2DecJsonResponse errorResponse =
          new Bin2DecJsonResponse(0, "Error: " + e.getMessage());
      try {
        return objectMapper.writeValueAsString(errorResponse);
      } catch (Exception ex) {
        return ex.getMessage();
      }
    }
  }
}
