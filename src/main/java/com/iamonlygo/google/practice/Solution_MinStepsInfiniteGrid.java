package com.iamonlygo.google.practice;

import java.util.List;

public class Solution_MinStepsInfiniteGrid {
  public int coverPoints(List<Integer> X, List<Integer> Y) {
    int steps = 0;
    for (int i = 0; i < X.size() - 1 && i < Y.size() - 1; i++) {

      steps += getSteps(X.get(i), Y.get(i), X.get(i + 1), Y.get(i + 1));

    }

    return Math.abs(steps);
  }

  private int getSteps(Integer x1, Integer y1, Integer x2, Integer y2) {
    int xDist = Math.abs(x2 - x1);
    int yDist = Math.abs(y2 - y1);
    if (xDist >= yDist) {
      return xDist;
    } else {
      return yDist;
    }
  }
}
