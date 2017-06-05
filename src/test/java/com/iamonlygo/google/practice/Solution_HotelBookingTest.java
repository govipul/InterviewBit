package com.iamonlygo.google.practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Solution_HotelBookingTest {

  private Solution_HotelBooking solution;

  @Before
  public void init() {
    solution = new Solution_HotelBooking();
  }

  @Test
  public void test() {
    ArrayList<Integer> arrive = new ArrayList<>(Arrays.asList(13, 14, 36, 19, 44, 1, 45, 4, 48, 23,
        32, 16, 37, 44, 47, 28, 8, 47, 4, 31, 25, 48, 49, 12, 7, 8));
    ArrayList<Integer> depart = new ArrayList<>(Arrays.asList(28, 27, 61, 34, 73, 18, 50, 5, 86, 28,
        34, 32, 75, 45, 68, 65, 35, 91, 13, 76, 60, 90, 67, 22, 51, 53));

    boolean isAvailable = solution.hotel(arrive, depart, 23);

    assertTrue(isAvailable);
  }

  @Test
  public void test_2() {
    ArrayList<Integer> arrive = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    ArrayList<Integer> depart = new ArrayList<>(Arrays.asList(10, 2, 6, 14));

    boolean isAvailable = solution.hotel(arrive, depart, 2);

    assertFalse(isAvailable);
  }

  @Test
  public void test_3() {
    ArrayList<Integer> arrive = new ArrayList<>(Arrays.asList(40, 18));
    ArrayList<Integer> depart = new ArrayList<>(Arrays.asList(40, 43));

    boolean isAvailable = solution.hotel(arrive, depart, 1);

    assertTrue(isAvailable);
  }

  @Test
  public void test_4() {
    ArrayList<Integer> arrive = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> depart = new ArrayList<>(Arrays.asList(2, 3, 4));

    boolean isAvailable = solution.hotel(arrive, depart, 1);

    assertTrue(isAvailable);
  }
}
