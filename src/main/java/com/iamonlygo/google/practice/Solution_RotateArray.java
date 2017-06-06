package com.iamonlygo.google.practice;

import java.util.ArrayList;

public class Solution_RotateArray {
  /**
   * You are given an n x n 2D matrix representing an image.
   * 
   * Rotate the image by 90 degrees (clockwise).
   * 
   * You need to do this in place.
   * 
   * Note that if you end up using an additional array, you will only receive partial score.
   * 
   * Example:
   * 
   * If the array is
   * 
   * [ [1, 2], [3, 4] ] Then the rotated array becomes:
   * 
   * [ [3, 1], [4, 2] ] See Expected Output
   * 
   */

  public void rotate(ArrayList<ArrayList<Integer>> a) {

    int[][] result = new int[a.size()][a.size()];

    for (int i = 0; i < a.size(); i++) {
      for (int j = 0; j < a.get(i).size(); j++) {
        result[j][i] = a.get(a.size() - i - 1).get(j);
      }
    }

    a.clear();
    for (int i = 0; i < result.length; i++) {
      a.add(new ArrayList<>());
      for (int j = 0; j < result[i].length; j++) {
        a.get(i).add(result[i][j]);
      }
    }

  }
}
