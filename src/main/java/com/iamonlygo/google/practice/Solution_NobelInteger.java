package com.iamonlygo.google.practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Given an integer array, find if an integer p exists in the array such that the number of integers
 * greater than p in the array equals to p If such an integer is found return 1 else return -1.
 *
 *
 * Input : [7, 3, 16, 10] Output : 3 Number of integers greater than 3 is three.
 * 
 * Input : [-1, -9, -2, -78, 0] Output : 0 Number of integers greater than 0 is zero.
 */

public class Solution_NobelInteger {
  public int solve(ArrayList<Integer> A) {

    Collections.sort(A);
    for (int i = 0; i < A.size() - 1; i++) {
      int num = A.get(i);
      if (num == A.get(i + 1))
        continue;
      if (num == (A.size() - 1 - i)) {
        return 1;
      }
    }

    if (A.get(A.size() - 1) == 0) {
      return 1;
    }

    return -1;

  }
}
