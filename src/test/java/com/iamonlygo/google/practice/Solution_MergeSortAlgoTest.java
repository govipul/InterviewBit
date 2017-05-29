package com.iamonlygo.google.practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;


public class Solution_MergeSortAlgoTest {


  private Solution_MergeSortAlgo mergeSort;

  @Before
  public void init() {
    mergeSort = new Solution_MergeSortAlgo();
  }

  @Test
  public void testMergeSort() {
    int[] a = {2, 4, 1, 6, 8, 5, 3, 7};
    mergeSort.mergeSort(a);
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
    assertArrayEquals(a, expected);
  }

  @Test
  public void testMerge() {
    int[] a = {1, 2, 4, 6, 3, 5, 7, 8};

    mergeSort.merge(a, new int[] {1, 2, 4, 6}, new int[] {3, 5, 7, 8});


    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
    assertArrayEquals(expected, a);
  }


}
