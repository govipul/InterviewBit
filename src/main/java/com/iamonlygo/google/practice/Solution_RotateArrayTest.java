package com.iamonlygo.google.practice;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Solution_RotateArrayTest {

  @Test
  public void test() {
    Solution_RotateArray solution = new Solution_RotateArray();

    ArrayList<ArrayList<Integer>> input = new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(1, 2)));
    input.add(new ArrayList<>(Arrays.asList(3, 4)));
    solution.rotate(input);
  }

}
