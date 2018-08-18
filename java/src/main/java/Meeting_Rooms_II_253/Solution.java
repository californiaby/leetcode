package Meeting_Rooms_II_253;

import utils.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
find the minimum number of conference rooms required.

Example 1:

Input: [[0, 30],[5, 10],[15, 20]]
Output: 2
Example 2:

Input: [[7,10],[2,4]]
Output: 1
 */

public class Solution {
  public int minMeetingRooms(Interval[] intervals) {

    // Same as "56. Merge Intervals"
    // Sort the array by start time and end time
    // Use two pointers. Max number of consumed rooms is arr length. For each non overlapping start and end count--

    if (intervals == null) return 0;
    if (intervals.length <= 0) return intervals.length;
    int count = intervals.length;

    // Create sorted arrays of start and end times
    int[] start = new int[count];
    int[] end = new int[count];
    for (int i = 0; i < count; i++) {
      start[i] = intervals[i].start;
      end[i] = intervals[i].end;
    }
    Arrays.sort(start);
    Arrays.sort(end);

    int p = 0;

    // Iterate through array of start times
    for (int i = 1; i < start.length; i++) {
      if (start[i] >= end[p]) {
        p++;
        count--;
      }
    }

    return count;
  }
}
