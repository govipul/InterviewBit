package com.iamonlygo.google.practice;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution_SparseArrayTest {

  private List<String> data;
  private List<String> query;
  private Solution_SparseArray sutSparseArray;


  @Before
  public void inti() {
    data = new ArrayList<>();
    data.add("aba");
    data.add("baba");
    data.add("aba");
    data.add("xzxb");
    query = new ArrayList<>();
    query.add("aba");
    query.add("xzxb");
    query.add("ab");
    sutSparseArray = new Solution_SparseArray(data, query);
  }

  @Test
  public void test() {
    int[] expected = {2, 1, 0};
    int[] count = sutSparseArray.runQuery();
    assertArrayEquals(expected, count);
  }

}
