package com.iamonlygo.google.practice;

import java.util.ArrayList;

/**
 * 
 * Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
 * details.
 * 
 * Example:
 * 
 * 
 * Input:
 * 
 * 1 2 3 4 5 6 7 8 9
 * 
 * Return the following :
 * 
 * [ [1], [2, 4], [3, 5, 7], [6, 8], [9] ]
 * 
 * 
 * Input : 1 2 3 4
 * 
 * Return the following :
 * 
 * [ [1], [2, 3], [4] ]
 * 
 *
 */

public class Solution_AntiDiagonals {

  public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    int colLength = a.get(0).size();
    int rowLength = a.size();

    int col = 0;
    while (col < colLength) {
      int row = 0;
      int k = col;
      ArrayList<Integer> diag = new ArrayList<>();
      while (k >= 0) {
        diag.add(a.get(row).get(k));
        k--;
        row++;
      }
      col++;

      result.add(diag);
    }

    int row = 1;
    while (row < rowLength) {
      col = colLength - 1;
      int k = row;
      ArrayList<Integer> diag = new ArrayList<>();
      while (k < rowLength) {
        diag.add(a.get(k).get(col));
        k++;
        col--;
      }
      row++;
      result.add(diag);
    }

    return result;
  }



}
