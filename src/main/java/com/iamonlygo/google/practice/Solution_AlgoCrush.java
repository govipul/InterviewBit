package com.iamonlygo.google.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_AlgoCrush {

  private BigInteger max = BigInteger.valueOf(Integer.MIN_VALUE);

  public void print() {
    System.out.println(max.toString());
  }

  public void performoperation(BigInteger[] arr, Scanner in) {
    BigInteger start = BigInteger.valueOf(in.nextInt() - 1);
    BigInteger end = BigInteger.valueOf(in.nextInt() - 1);
    BigInteger k = BigInteger.valueOf(in.nextInt());

    System.out.println(start);
    System.out.println(end);
    System.out.println(k);

    while (!start.equals(end)) {
      int i = start.intValue();
      System.out.println(i);
      arr[i] = arr[i].add(k);
      if (max.compareTo(arr[i]) == -1) {
        max = arr[i];
      }
      start = start.add(BigInteger.ONE);
    }
  }

  private void initArray(BigInteger[] arr) {
    for (int index = 0; index < arr.length; index++) {
      arr[index] = BigInteger.ZERO;
    }
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int operation = in.nextInt();
    BigInteger[] arr = new BigInteger[size];
    Solution_AlgoCrush s = new Solution_AlgoCrush();
    s.initArray(arr);
    while (operation > 0) {

      s.performoperation(arr, in);
      operation--;
    }

    s.print();
  }
}
