package com.iamonlygo.google.practice;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Solution_SpiralSecondTest {

  Solution_SpiralSecond solution = null;

  @Before
  public void init() {
    solution = new Solution_SpiralSecond();
  }

  @Test
  public void test() {

    ArrayList<ArrayList<Integer>> generateMatrix = solution.generateMatrix(4);
    System.out.println(generateMatrix);
  }

}
