package com.iamonlygo.google.practice;

import java.util.List;

/**
 * Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <=
 * A[j].
 * 
 * If there is no solution possible, return -1.
 * 
 * Example :
 * 
 * A : [3 5 4 2]
 * 
 * Output : 2 for the pair (3, 4)
 *
 */
public class Solution_MaxDistance {
  public int maximumGap(final List<Integer> a) {

    int[] LMin = new int[a.size()];
    int[] RMax = new int[a.size()];

    LMin[0] = a.get(0);
    RMax[RMax.length - 1] = a.get(RMax.length - 1);

    for (int i = 1; i < a.size(); i++) {
      LMin[i] = Math.min(a.get(i), LMin[i - 1]);
    }

    for (int i = a.size() - 2; i >= 0; i--) {
      RMax[i] = Math.max(a.get(i), RMax[i + 1]);
    }

    int i = 0, j = 0, maxDiff = -1;

    while (i < a.size() && j < a.size()) {

      if (LMin[i] < RMax[j]) {
        maxDiff = Math.max(maxDiff, j - i);
        j++;
      } else {
        i++;
      }
    }



    return maxDiff;
  }
}
