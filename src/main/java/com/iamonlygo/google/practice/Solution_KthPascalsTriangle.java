package com.iamonlygo.google.practice;

import java.util.ArrayList;

/**
 * Given an index k, return the kth row of the Pascal’s triangle.
 * 
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 * 
 * Example:
 * 
 * Input : k = 3
 * 
 * Return : [1,3,3,1] NOTE : k is 0 based. k = 0, corresponds to the row [1].
 */
public class Solution_KthPascalsTriangle {

  private int[][] C_MEM = null;

  public ArrayList<Integer> generate(int a) {

    C_MEM = new int[a + 1][a + 1];
    ArrayList<Integer> row = new ArrayList<>();
    new ArrayList<>();
    for (int k = 0; k <= a; k++) {
      row.add(C(a, k));
    }
    return row;
  }

  private Integer C(int n, int k) {

    if (C_MEM[n][k] != 0) {
      return C_MEM[n][k];
    }

    if (n == 0 || n == 1 || k == 0 || n == k) {
      C_MEM[n][k] = 1;
      return 1;
    } else {
      C_MEM[n][k] = C(n - 1, k - 1) + C(n - 1, k);
      return C_MEM[n][k];
    }
  }
}
