package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution_LargestNumberTest {

  private Solution_LargestNumber solution;

  @Before
  public void init() {
    solution = new Solution_LargestNumber();
  }

  @Test
  public void test() {
    List<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(3, 30, 34, 5, 9));
    String expected = "9534330";

    assertEquals(expected, solution.largestNumber(input));
  }


  @Test
  public void test_zero() {
    List<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(0, 0, 0, 0, 0, 0));
    String expected = "0";

    assertEquals(expected, solution.largestNumber(input));
  }


  @Test
  public void test_oneNumber() {
    List<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(0, 0, 0, 0, 0, 2));
    String expected = "200000";

    assertEquals(expected, solution.largestNumber(input));
  }

}
