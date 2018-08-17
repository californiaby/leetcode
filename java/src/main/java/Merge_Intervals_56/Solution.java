package Merge_Intervals_56;

import utils.Interval;

import java.util.ArrayList;
import java.util.List;

/*
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
 */

public class Solution {
  public List<Interval> merge(List<Interval> intervals) {

    // When intervals are merged? When current start point is overlapping with another interval's end point
    // What else? end is always > start
    // So... If sorted by start point, when processing interval[n] we need to compare it to previous only,
    // because it will always be the one having max end point

    // Return null or single interval
    if (intervals == null || intervals.size() <= 1) return intervals;

    // Sort the list by start point
    intervals.sort((a, b) -> a.start - b.start);

    List<Interval> ans = new ArrayList<>();
    ans.add(intervals.get(0));

    // Iterate through the list and check each node's start point with previous' end point. If overlaps - update.
    for (int i = 1; i < intervals.size(); i++) {
      Interval curr = intervals.get(i);
      Interval prev = ans.get(ans.size()-1);

      if (prev.end >= curr.start) {
        prev.end = Math.max(prev.end, curr.end);    // overlaps -> get the max of prev and curr end points
      } else {
        ans.add(curr);                              // does not overlap -> add current interval to the ans
      }
    }

    return ans;
  }

}
