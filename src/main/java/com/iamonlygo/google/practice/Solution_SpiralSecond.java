package com.iamonlygo.google.practice;

import java.util.ArrayList;

public class Solution_SpiralSecond {

  /**
   * Fill the array in spiral order and return the arraylist filled in spiral
   * 
   * @param n
   * @return
   */
  public ArrayList<ArrayList<Integer>> generateMatrix(int n) {

    int top = 0, right = n - 1, bottom = n - 1, left = 0;

    ArrayList<ArrayList<Integer>> dataList = new ArrayList<>(n);

    int[][] data = new int[n][n];

    int count = 1;
    int dir = 0;
    while (top <= bottom && left <= right) {
      if (dir == 0) {
        // L --> R
        for (int i = left; i <= right; i++) {
          data[top][i] = count++;
        }
        dir = 1;
        top++;
      } else if (dir == 1) {
        // T --> B
        for (int i = top; i <= bottom; i++) {
          data[i][right] = count++;
        }
        dir = 2;
        right--;
      } else if (dir == 2) {
        // R --> L
        for (int i = right; i >= left; i--) {
          data[bottom][i] = count++;
        }
        dir = 3;
        bottom--;
      } else if (dir == 3) {
        // B --> T
        for (int i = bottom; i >= top; i--) {
          data[i][left] = count++;
        }
        dir = 0;
        left++;
      }
    }

    for (int i = 0; i < n; i++) {
      dataList.add(new ArrayList<>());
      for (int j = 0; j < n; j++) {
        dataList.get(i).add(j, data[i][j]);
      }
    }

    return dataList;

  }

}
