package com.iamonlygo.google.practice;

public class Solution_MergeSortAlgo {


  public void mergeSort(int[] a) {
    if (a.length < 2)
      return;

    int mid = a.length / 2;

    int[] right = new int[mid];
    int[] left = new int[mid];

    for (int i = 0; i < mid; i++) {
      right[i] = a[i];
    }

    for (int i = mid; i < a.length; i++) {
      left[i - mid] = a[i];
    }

    mergeSort(right);
    mergeSort(left);
    merge(a, right, left);
  }

  public void merge(int[] a, int[] right, int[] left) {
    int i = 0, j = 0, k = 0;
    while (i < right.length && j < left.length) {

      if (right[i] < left[j]) {
        a[k] = right[i];
        i++;
      } else {
        a[k] = left[j];
        j++;
      }
      k++;
    }

    while (i < right.length) {
      a[k++] = right[i++];
    }

    while (j < left.length) {
      a[k++] = left[j++];
    }
  }

}
