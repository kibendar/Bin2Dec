package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bin2DecJSONResult {

  private final ObjectMapper objectMapper;

  public String sentJSONDecimalResult(int input) {

    try {

      Bin2DecJSONResponse response = new Bin2DecJSONResponse(input, "Success");

      return objectMapper.writeValueAsString(response);
    } catch (Exception e) {
      Bin2DecJSONResponse errorResponse = new Bin2DecJSONResponse(0, "Error: " + e.getMessage());
      try {
        return objectMapper.writeValueAsString(errorResponse);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    return null;
  }
}
