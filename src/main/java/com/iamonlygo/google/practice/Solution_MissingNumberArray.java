package com.iamonlygo.google.practice;

import java.util.ArrayList;
import java.util.List;

public class Solution_MissingNumberArray {
  /**
   * You are given a read only array of n integers from 1 to n.
   * 
   * Each integer appears exactly once except A which appears twice and B which is missing.
   * 
   * Return A and B.
   * 
   * Note: Your algorithm should have a linear runtime complexity. Could you implement it without
   * using extra memory?
   * 
   * Note that in your output A should precede B. Input:[3 1 2 5 3]
   * 
   * Output:[3, 4]
   * 
   * A = 3, B = 4
   */
  public ArrayList<Integer> repeatedNumber(final List<Integer> a) {

    ArrayList<Integer> result = new ArrayList<Integer>();
    int[] data = new int[a.size()];
    for (int i = 0; i < a.size(); i++) {
      if (data[a.get(i) - 1] == 0) {
        data[a.get(i) - 1]++;
      } else if (data[a.get(i) - 1] == 1) {
        result.add(a.get(i));
      }
    }

    for (int i = 0; i < a.size(); i++) {
      if (data[i] == 0) {
        result.add(i + 1);
        break;
      }
    }



    return result;
  }
}
