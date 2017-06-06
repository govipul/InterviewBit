package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution_MaxDistanceTest {

  private Solution_MaxDistance solution;

  @Before
  public void init() {
    solution = new Solution_MaxDistance();
  }

  @Test
  public void test() {
    List<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 4, 2));
    int expected = 2;
    assertEquals(expected, solution.maximumGap(input));
  }

  @Test
  public void test_negative() {
    List<Integer> input = new ArrayList<>(Arrays.asList(-3, -5, -4, -2));
    int expected = 3;
    assertEquals(expected, solution.maximumGap(input));
  }

  @Test
  public void test_same() {
    List<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
    int expected = 3;
    assertEquals(expected, solution.maximumGap(input));
  }

  @Test
  public void test_arrange() {
    List<Integer> input = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
    int expected = 0;
    assertEquals(expected, solution.maximumGap(input));
  }

  @Test
  public void test_arrange_desc() {
    List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    int expected = 3;
    assertEquals(expected, solution.maximumGap(input));
  }

  @Test
  public void test_arrange_negative() {
    List<Integer> input = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));
    int expected = 0;
    assertEquals(expected, solution.maximumGap(input));
  }

  @Test
  public void test_arrange_single() {
    List<Integer> input = new ArrayList<>(Arrays.asList(1));
    int expected = 0;
    assertEquals(expected, solution.maximumGap(input));
  }

}
