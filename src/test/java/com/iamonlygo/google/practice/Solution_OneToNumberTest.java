package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution_OneToNumberTest {

  private ArrayList<Integer> input;

  private ArrayList<Integer> expected;

  private Solution_OneToNumber solution;

  @Before
  public void init() {
    solution = new Solution_OneToNumber();
  }

  private ArrayList<Integer> fillList(Integer[] arr) {
    ArrayList<Integer> returnList = new ArrayList<>();
    for (Integer val : arr) {
      returnList.add(val);
    }
    return returnList;
  }

  @Test
  public void test() {
    Integer[] a = {1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5};
    Integer[] b = {1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 6};
    input = fillList(a);
    expected = fillList(b);
    List<Integer> result = solution.plusOne(input);
    assertEquals(expected, result);
  }

  @Test
  public void test_with_zero() {
    Integer[] a = {0, 1, 2, 3};
    Integer[] b = {1, 2, 4};
    input = fillList(a);
    expected = fillList(b);
    List<Integer> result = solution.plusOne(input);
    assertEquals(expected, result);
  }

  @Test
  public void test_last_9() {
    Integer[] a = {9, 9};
    Integer[] b = {1, 0, 0};
    input = fillList(a);
    expected = fillList(b);
    List<Integer> result = solution.plusOne(input);
    assertEquals(expected, result);
  }



  @Test
  public void test_last_long_start_0() {
    Integer[] a = {0, 3, 7, 6, 4, 0, 5, 5, 5};
    Integer[] b = {3, 7, 6, 4, 0, 5, 5, 6};
    input = fillList(a);
    expected = fillList(b);
    List<Integer> result = solution.plusOne(input);
    assertEquals(expected, result);
  }

}
