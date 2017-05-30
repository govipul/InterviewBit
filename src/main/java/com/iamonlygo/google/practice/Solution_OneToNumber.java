package com.iamonlygo.google.practice;

import java.util.ArrayList;

public class Solution_OneToNumber {

  public ArrayList<Integer> plusOne(final ArrayList<Integer> a) {

    int carry = 1;
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = a.size() - 1; i >= 0; i--) {
      int digit = a.get(i) + carry;
      result.add(digit % 10);
      carry = digit / 10;
    }
    while (carry != 0) {
      result.add(carry % 10);
      carry /= 10;
    }
    return removeTraillingZero(result);
  }

  private ArrayList<Integer> removeTraillingZero(final ArrayList<Integer> result) {
    final ArrayList<Integer> data = new ArrayList<>();
    boolean flag = true;
    for (int index = result.size() - 1; index >= 0; index--) {
      if (flag && result.get(index) == 0) {
        continue;
      } else {
        flag = false;
        data.add(result.get(index));
      }
    }
    return data;
  }

}
