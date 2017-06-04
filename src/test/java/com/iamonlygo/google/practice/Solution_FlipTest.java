package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution_FlipTest {

  private Solution_Flip solution = null;

  @Before
  public void init() {
    solution = new Solution_Flip();
  }

  @Test
  public void test() {
    ArrayList<Integer> flip = solution.flip("010");
    int[] expected = {1, 1};
    assertEquals(Arrays.toString(expected), Arrays.toString(flip.toArray()));
  }

}
