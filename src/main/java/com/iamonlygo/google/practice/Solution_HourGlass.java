package com.iamonlygo.google.practice;

public class Solution_HourGlass {

    public static int getMaxHourGlassSum(int[][] inputs) {
	int max = -1;
	for (int i = 0; i <= inputs.length / 2; i++) {
	    for (int j = 0; j <= inputs[i].length / 2; j++) {
		int sum = inputs[i][j] + inputs[i][j + 1] + inputs[i][j + 2];
		sum += inputs[i + 1][j + 1];
		sum += inputs[i + 2][j] + inputs[i + 2][j + 1] + inputs[i + 2][j + 2];
		if (sum > max) {
		    max = sum;
		}
	    }
	}
	return max;
    }

}
