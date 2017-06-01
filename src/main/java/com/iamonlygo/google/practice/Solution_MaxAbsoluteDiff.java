package com.iamonlygo.google.practice;

import java.util.ArrayList;

public class Solution_MaxAbsoluteDiff {
  /**
   * You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1
   * ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of
   * x. A=[1, 3, -1]
   * 
   * f(1, 1) = f(2, 2) = f(3, 3) = 0 f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3 f(1, 3) = f(3, 1) =
   * |1 - (-1)| + |1 - 3| = 4 f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5
   * 
   * So, we return 5.
   */
  public int maxArr(ArrayList<Integer> A) {
    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
    int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
    for (int i = 0; i < A.size(); i++) {
      max1 = Math.max(A.get(i) + 1, max1);
      max2 = Math.max(A.get(i) - i, max2);

      min1 = Math.min(A.get(i) + i, min1);
      min2 = Math.min(A.get(i) - i, min2);
    }

    int result = Integer.MIN_VALUE;
    result = Math.max(max1 - min1, result);
    result = Math.max(max2 - min2, result);
    return result;
  }
}
