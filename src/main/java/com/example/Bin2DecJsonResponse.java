package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *Class for shering the result on convension in JSON format.
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bin2DecJsonResponse {

  public int decimal;
  public String status;
}
