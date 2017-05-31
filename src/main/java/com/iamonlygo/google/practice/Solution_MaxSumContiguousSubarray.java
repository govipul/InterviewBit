package com.iamonlygo.google.practice;

import java.util.List;

public class Solution_MaxSumContiguousSubarray {

  public int maxSubArray(final List<Integer> a) {
    int max_current = a.get(0), max_global = a.get(0);

    for (int index = 1; index < a.size(); index++) {

      max_current = Math.max(a.get(index), max_current + a.get(index));

      if (max_current > max_global) {
        max_global = max_current;
      }

    }

    return max_global;
  }
}
