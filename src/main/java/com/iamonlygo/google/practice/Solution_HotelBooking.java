package com.iamonlygo.google.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * A hotel manager has to process N advance bookings of rooms for the next season. His hotel has K
 * rooms. Bookings contain an arrival date and a departure date. He wants to find out whether there
 * are enough rooms in the hotel to satisfy the demand. Write a program that solves this problem in
 * time O(N log N) .
 * 
 * Input:
 * 
 * 
 * First list for arrival time of booking. Second list for departure time of booking. Third is K
 * which denotes count of rooms.
 * 
 * Output:
 * 
 * A boolean which tells whether its possible to make a booking. Return 0/1 for C programs. O -> No
 * there are not enough rooms for N booking. 1 -> Yes there are enough rooms for N booking. Example
 * :
 * 
 * Input : Arrivals : [1 3 5] Departures : [2 6 8] K : 1
 * 
 * Return : False / 0
 * 
 * At day = 5, there are 2 guests in the hotel. But I have only one room. See Expected Output
 * NotesAll Notes
 * 
 *  What is day 5? How did you come up with such number. Also time you have diven is in hour, day,
 * or what? Time to Solve: 122 min. / Average Solving Time: 53 min.
 *
 */

class Interval implements Comparable<Interval> {
  private boolean isArrive;

  public boolean isArrive() {
    return isArrive;
  }

  public int getDay() {
    return day;
  }

  private int day;

  public Interval(int day, boolean isArrive) {
    this.day = day;
    this.isArrive = isArrive;
  }

  @Override
  public int compareTo(Interval o) {
    return this.day == o.day ? this.isArrive ? 1 : -1 : this.day - o.day;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.day + ":" + (this.isArrive ? "A" : "D");
  }


}


public class Solution_HotelBooking {



  public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

    if (arrive == null || arrive.isEmpty() || depart == null || depart.isEmpty() || K < 1) {
      return false;
    }
    List<Interval> data = new ArrayList<>();
    for (int i = 0; i < arrive.size(); i++) {
      data.add(new Interval(arrive.get(i), true));
      data.add(new Interval(depart.get(i), false));
    }


    System.out.println(data);
    Collections.sort(data);
    System.out.println(data);
    for (int i = 0; i < data.size(); i++) {

      if (data.get(i).isArrive()) {
        K--;
      } else if (!data.get(i).isArrive()) {
        K++;
      }

      if (K < 0) {
        return false;
      }

    }

    return true;

  }
}
