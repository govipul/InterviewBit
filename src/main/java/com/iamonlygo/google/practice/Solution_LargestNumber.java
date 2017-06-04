package com.iamonlygo.google.practice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example:
 * 
 * Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class Solution_LargestNumber {



  public static Comparator<Integer> MyComparator = new Comparator<Integer>() {

    @Override
    public int compare(Integer o1, Integer o2) {
      String XY = o1.toString() + o2.toString();
      String YX = o2.toString() + o1.toString();

      return -XY.compareTo(YX);
    }
  };

  public String largestNumber(final List<Integer> a) {

    ArrayList<Integer> sortList = new ArrayList<>(a);

    Collections.sort(sortList, MyComparator);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sortList.size(); i++) {
      sb.append(sortList.get(i));
    }
    BigInteger b = new BigInteger(sb.toString());
    return b.toString();

  }

}
