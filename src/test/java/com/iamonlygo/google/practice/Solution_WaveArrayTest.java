package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution_WaveArrayTest {

  private Solution_WaveArray solution;

  @Before
  public void init() {
    solution = new Solution_WaveArray();
  }

  @Test
  public void test() {

    ArrayList<Integer> input = new ArrayList<>();
    input.addAll(Arrays.asList(1, 2, 3, 4));

    ArrayList<Integer> expected = new ArrayList<>();
    expected.addAll(Arrays.asList(2, 1, 4, 3));

    assertEquals(expected.toString(), solution.wave(input).toString());
  }

}
