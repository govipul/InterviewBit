package com.iamonlygo.google.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution_HourGlassTest {

    private int[][] inputs = new int[6][6];

    @Before
    public void init() {
	inputs[0] = new int[] { 1, 1, 1, 0, 0, 0 };
	inputs[1] = new int[] { 0, 1, 0, 0, 0, 0 };
	inputs[2] = new int[] { 1, 1, 1, 0, 0, 0 };
	inputs[3] = new int[] { 0, 0, 2, 4, 4, 0 };
	inputs[4] = new int[] { 0, 0, 0, 2, 0, 0 };
	inputs[5] = new int[] { 0, 0, 1, 2, 4, 0 };
    }

    @Test
    public void test() {
	int maxHourGlassSum = Solution_HourGlass.getMaxHourGlassSum(inputs);
	assertEquals(19, maxHourGlassSum);
    }
}
