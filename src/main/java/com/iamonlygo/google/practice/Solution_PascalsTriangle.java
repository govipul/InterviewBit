package com.iamonlygo.google.practice;

import java.util.ArrayList;

/**
 * @author Vigo Given numRows, generate the first numRows of Pascal’s triangle.
 * 
 *         Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row
 *         R - 1.
 * 
 *         Example:
 * 
 *         Given numRows = 5,
 * 
 *         Return
 * 
 *         [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
 */
public class Solution_PascalsTriangle {

  private int[][] C_MEM = null;

  public ArrayList<ArrayList<Integer>> generate(int a) {

    C_MEM = new int[a][a];
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for (int n = 0; n < a; n++) {
      ArrayList<Integer> row = new ArrayList<>();
      for (int k = 0; k <= n; k++) {
        row.add(C(n, k));
      }
      result.add(row);
    }
    System.out.println(result);
    return result;
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
