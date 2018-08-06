package amz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list, consisting of two elements. Each element is a list representing foreground and background processes.
Each process is a list of two Integers: ID and amount of RAM consumed by process.
Given initial memory capacity, find a combination of two processes that use the memory in the most optimal way
(i.e. the closes sum to capacity value).
Return a list with IDs of foreground and background processes.
 */

/*
Solution:
#1: iterate over first list, then iterate over second list, calculate sum for each pair. O(n * k)

#2:
1. sort two lists O(nlogn + klogk).
2.a Iterate over lists from different ends looking for closest approximation: o (n + k)
2.b or iterate over 1st list and use binary search for iteration over second: O (n * log k) to find the best possible
combination

I'm going forward with solution 2.a
 */

public class TwoElementsClosestToTarget {

  public List<Integer> getOptimalIds(int capacity, List<List<Integer>> foreground, List<List<Integer>> background) {
    List<Integer> ans = new ArrayList<>();

    // I think we don't need to handle as error a case when both lists are empty
    if (capacity <= 0 || foreground == null || background == null) return null;

    // Sort foreground and background by element[1] - consumed memory
    foreground.sort((p1, p2) -> p1.get(1) > p2.get(1) ? 1 : -1);
    background.sort((p1, p2) -> p1.get(1) > p2.get(1) ? 1 : -1);

    // i and j are pointers, bestDiff, fId and bId are solutions with the best value
    int i = 0;
    int j = background.size() - 1;
    int bestDiff = capacity;
    int fId = capacity;
    int bId = capacity;

    // Iterate over both lists while pointers are within range
    while (i <= foreground.size() - 1 && j >= 0) {

      // Get current values from the lists
      int f = foreground.get(i).get(1);
      int b = background.get(j).get(1);

      // Get current diff
      int currentDiff = capacity - f - b;

      // If current Diff is not overflow, compare to best Diff, otherwise reduce memory consumption
      if (currentDiff >= 0) {
        if (currentDiff < bestDiff) {

          // Current diff is better > update stored values
          fId = foreground.get(i).get(0);
          bId = background.get(j).get(0);
          bestDiff = currentDiff;
        }

        i++;
      } else {
        j--;
      }

    }

    // Populate ans only if solution was found, otherwise return an empty list
    if (bestDiff != capacity) {
      ans.add(fId);
      ans.add(bId);
    }

    return ans;
  }

}
