package com.iamonlygo.google.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_OneToNumber {

  public ArrayList<Integer> plusOne(ArrayList<Integer> a) {

    Collections.reverse(a);

    int carry = 1;

    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
      int digit = a.get(i) + carry;
      result.add(i, digit % 10);
      carry = digit / 10;
    }
    if (carry != 0) {
      result.add(1);
    }

    Collections.reverse(result);

    int i = 0;
    for (; i < result.size(); i++) {
      if (result.get(i) != 0) {
        break;
      }
    }

    List<Integer> data = null;
    if (i > 0) {
      data = result.subList(i, result.size());
    } else {
      data = result;
    }


    result = new ArrayList<>(data);
    return result;

  }

}
