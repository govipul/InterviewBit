package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Solution_KthPascalsTriangleTest {

  @Test
  public void test() {
    Solution_KthPascalsTriangle solution = new Solution_KthPascalsTriangle();
    ArrayList<Integer> generate = solution.generate(5);

    assertEquals("[1, 5, 10, 10, 5, 1]", generate.toString());
  }

  @Test
  public void test_Zero() {
    Solution_KthPascalsTriangle solution = new Solution_KthPascalsTriangle();
    ArrayList<Integer> generate = solution.generate(0);

    assertEquals("[1]", generate.toString());
  }

}
