package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution_MaxSumContiguousSubarrayTest {

  Solution_MaxSumContiguousSubarray solution = null;

  List<Integer> input = null;

  @Before
  public void init() {
    solution = new Solution_MaxSumContiguousSubarray();
    input = new ArrayList<>();

  }

  @Test
  public void test_given_input() {
    input.addAll(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
    assertEquals(6, solution.maxSubArray(input));
  }

  @Test
  public void test_custom_input() {
    input.addAll(Arrays.asList(1, -1, 2, 1));
    assertEquals(3, solution.maxSubArray(input));
  }

  @Test
  public void test_custom_input_zero() {
    input.addAll(Arrays.asList(1, 0, 2, -1));
    assertEquals(3, solution.maxSubArray(input));
  }

  @Test
  public void test_custom_input_negative() {
    input.addAll(Arrays.asList(-1, 0, -2, -1));
    assertEquals(0, solution.maxSubArray(input));
  }

  @Test
  public void test_custom_input_all_negative() {
    input.addAll(Arrays.asList(-1, -3, -2, -1));
    assertEquals(-1, solution.maxSubArray(input));
  }



}
