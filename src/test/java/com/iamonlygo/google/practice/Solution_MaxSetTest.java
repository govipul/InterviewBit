package com.iamonlygo.google.practice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution_MaxSetTest {

  private Solution_MaxSet solution;

  @Before
  public void init() {
    solution = new Solution_MaxSet();
  }

  @Test
  public void test() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(1, 2, 5, -7, 2, 5));
    Object[] expected = {1, 2, 5};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }

  @Test
  public void test_2() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(2, 5, -7, 1, 2, 5));
    Object[] expected = {1, 2, 5};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }


  @Test
  public void test_0() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(0, 0, -1, 0));
    Object[] expected = {0, 0};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }

  @Test
  public void test_left() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368));
    Object[] expected = {1967513926, 1540383426};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }

  @Test
  public void test_right() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(-1967513926, -1540383426, 1303455736, 521595368));
    Object[] expected = {1303455736, 521595368};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }


  @Test
  public void test_multi_negative() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(1101513929, 1315634022, -1369133069, 1059961393, 628175011,
        -1131176229, -859484421));
    Object[] expected = {1101513929, 1315634022};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }

  @Test
  public void test_big_negative() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(-846930886, -1714636915, 424238335, -1649760492));
    Object[] expected = {424238335};
    assertArrayEquals(expected, solution.maxset(input).toArray());
  }

  @Test
  public void test_negative() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(-1, -1, -1, -1, -1));
    ArrayList<Integer> expected = solution.maxset(input);
    assertTrue(expected.size() == 0);
  }



  @Test
  public void test_single() {
    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(114765));
    ArrayList<Integer> expected = solution.maxset(input);
    assertTrue(expected.size() == 1);
  }

  @Test
  public void test_null() {
    ArrayList<Integer> input = new ArrayList<>();
    ArrayList<Integer> expected = solution.maxset(input);
    assertTrue(expected.size() == 0);
  }

}
