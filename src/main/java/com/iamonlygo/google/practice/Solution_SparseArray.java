package com.iamonlygo.google.practice;

import java.util.List;

public class Solution_SparseArray {

  private List<String> data;
  private List<String> query;

  public Solution_SparseArray(List<String> data, List<String> query) {
    this.data = data;
    this.query = query;
  }

  public int[] runQuery() {
    int[] result = new int[query.size()];
    int index = 0;
    for (String q : query) {
      int count = 0;
      for (String d : data) {
        if (d.equals(q)) {
          count++;
        }
      }
      result[index++] = count;
    }
    return result;
  }



}
