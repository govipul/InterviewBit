package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution_MinStepsInfiniteGridTest {

  private List<Integer> X, Y;
  private Solution_MinStepsInfiniteGrid solution;

  @Before
  public void init() {
    Integer[] a = {4, 8, -7, -5, -13, 9, -7, 8};
    Integer[] b = {4, -15, -10, -3, -13, 12, 8, -8};
    X = Arrays.asList(a);
    Y = Arrays.asList(b);
    solution = new Solution_MinStepsInfiniteGrid();
  }

  @Test
  public void test() {
    int result = solution.coverPoints(X, Y);
    int expected = 108;
    assertEquals(result, expected);
  }

}
