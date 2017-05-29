package com.iamonlygo.google.practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution_LeftRotationTest {

  Solution_LeftRotation sutLeftRotation;

  @Before
  public void init() {
    int[] input = {1, 2, 3, 4, 5};
    sutLeftRotation = new Solution_LeftRotation(input);
  }

  @Test
  public void testRotateLeft_OneRotation() {

    int[] output = {2, 3, 4, 5, 1};
    sutLeftRotation.rotateLeft();
    assertArrayEquals(output, sutLeftRotation.getArray());
  }

  @Test
  public void testRotateLeft_ManyRotation() {
    int[] output = {5, 1, 2, 3, 4};
    sutLeftRotation.rotateMany(4);
    assertArrayEquals(output, sutLeftRotation.getArray());
  }

}
