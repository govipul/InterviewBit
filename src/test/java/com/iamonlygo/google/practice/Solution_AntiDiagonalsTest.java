package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution_AntiDiagonalsTest {


  Solution_AntiDiagonals solution;

  @Before
  public void init() {
    solution = new Solution_AntiDiagonals();
  }


  @Test
  public void test_small() {

    ArrayList<ArrayList<Integer>> input = new ArrayList<>();

    input.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
    input.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
    System.out.println(solution.diagonal(input).toString());


    ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

    expected.add(new ArrayList<Integer>(Arrays.asList(1)));
    expected.add(new ArrayList<Integer>(Arrays.asList(2, 3)));
    expected.add(new ArrayList<Integer>(Arrays.asList(4)));
    assertEquals(expected.toString(), solution.diagonal(input).toString());
  }

  @Test
  public void test() {

    ArrayList<ArrayList<Integer>> input = new ArrayList<>();

    input.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
    input.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
    input.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));

    ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

    expected.add(new ArrayList<Integer>(Arrays.asList(1)));
    expected.add(new ArrayList<Integer>(Arrays.asList(2, 4)));
    expected.add(new ArrayList<Integer>(Arrays.asList(3, 5, 7)));
    expected.add(new ArrayList<Integer>(Arrays.asList(6, 8)));
    expected.add(new ArrayList<Integer>(Arrays.asList(9)));

    assertEquals(expected.toString(), solution.diagonal(input).toString());
  }

}
