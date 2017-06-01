package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Solution_MaxAbsoluteDiffTest {

  Solution_MaxAbsoluteDiff solution = null;

  @Before
  public void init() {
    solution = new Solution_MaxAbsoluteDiff();
  }

  @Test
  public void test() {
    ArrayList<Integer> input = new ArrayList<>();
    input.add(1);
    input.add(3);
    input.add(-1);
    int result = solution.maxArr(input);

    assertEquals(5, result);
  }

}
