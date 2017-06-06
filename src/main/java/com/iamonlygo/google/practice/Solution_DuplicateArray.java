package com.iamonlygo.google.practice;

import java.util.List;

public class Solution_DuplicateArray {
  public int repeatedNumber(final List<Integer> a) {

    int[] duplicate = new int[a.size() + 1];

    for (int i = 0; i < a.size(); i++) {
      duplicate[a.get(i)]++;
    }

    for (int i = 0; i < duplicate.length; i++) {

      if (duplicate[i] > 1) {
        return i;
      }

    }

    return -1;
  }
}
