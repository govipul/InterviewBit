package com.iamonlygo.google.practice;

import java.util.ArrayList;


public class Solution_Flip {


  public ArrayList<Integer> flip(String A) {
    ArrayList<Integer> result = new ArrayList<>();

    if (A.length() == 0) {
      return result;
    }

    int[] array = new int[A.length()];
    int numOnes = 0;

    for (int i = 0; i < A.length(); i++) {
      array[i] = A.charAt(i) == '0' ? 1 : -1;
      numOnes += array[i];
    }

    if (numOnes == -array.length)
      return result;

    int leftLimitForThisBestSum = 0;
    int rightLimitForThisBestSum = 0;
    int thisBestSum = array[0];
    int prevBestSum = array[0];

    int leftLimitOfBestSum = 0;
    int rightLimitOfBestSum = 0;
    int bestSum = array[0];


    for (int i = 1; i < array.length; i++) {
      int prevPlusThisNum = array[i] + prevBestSum;
      if (array[i] > prevPlusThisNum) {
        leftLimitForThisBestSum = i;
        rightLimitForThisBestSum = i;
        thisBestSum = array[i];
      } else {
        rightLimitForThisBestSum = i;
        thisBestSum = prevPlusThisNum;
      }

      if (thisBestSum > bestSum) {
        bestSum = thisBestSum;
        leftLimitOfBestSum = leftLimitForThisBestSum;
        rightLimitOfBestSum = rightLimitForThisBestSum;
      }
      prevBestSum = thisBestSum;
    }

    result.add(leftLimitOfBestSum + 1);
    result.add(rightLimitOfBestSum + 1);

    return result;
  }

}
