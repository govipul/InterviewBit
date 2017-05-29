package com.iamonlygo.google.practice;

public class Solution_LeftRotation {

  private int[] array;

  public Solution_LeftRotation(int[] array) {
    this.array = array;
  }

  public void rotateLeft() {
    if (null != array && array.length > 0) {
      int temp = array[0];
      for (int index = 1; index < array.length; index++) {
        array[index - 1] = array[index];
      }
      array[array.length - 1] = temp;
    }
  }

  public void rotateMany(int n) {
    if (n > 0) {
      for (int index = 0; index < n; index++) {
        rotateLeft();
      }
    }
  }

  public int[] getArray() {
    return array;
  }

}
