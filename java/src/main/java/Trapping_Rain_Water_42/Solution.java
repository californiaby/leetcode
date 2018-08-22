package Trapping_Rain_Water_42;

public class Solution {
  public int trap(int[] height) {
    return twoPointers(height);
  }

  /**
   * Calculates the amount of water using dynamic programming approach.
   * In order to solve this problem we need to get the height between left and right max points - current point height.
   * Brute force solution would be to run this algo for each pair of peeks.
   * However, we can do this in O(n) time complexity.
   * Iterate left-to-right and store max_left height. Then do the same right-to-left.
   * Intersection of these two arrays gives a resulting height.
   * Now just subtract the current point's height - voila!
   * @param height map of heights
   * @return
   */
  private int dynamicProgramming(int[] height) {
    int n = height.length;
    if (height == null || n <= 1) return 0;

    int[] leftMax = new int[n];
    int[] rightMax = new int[n];
    int ans = 0;

    // Left-to-right
    leftMax[0] = height[0];
    for (int i = 1; i < leftMax.length; i++) {
      leftMax[i] = Math.max(leftMax[i-1], height[i]);
    }

    // Right-to-left
    rightMax[n-1] = height[n-1];
    for (int i = rightMax.length-2; i >=0; i--) {
      rightMax[i] = Math.max(rightMax[i+1], height[i]);
    }

    // Get intersection
    for (int i = 0; i < n; i++) {
      ans = ans + Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return ans;
  }

  /* ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== ==== */

  /**
   * Solution using two pointers. Uses the same algo as above but switches iterators until they meet.
   * @param height
   * @return
   */
  private int twoPointers(int[] height) {

    int n = height.length;
    if (height == null || n <= 1) return 0;

    int left = 0;
    int right = n-1;
    int leftMax = 0;
    int rightMax = 0;
    int ans = 0;

    while (left < right) {
      if (height[left] < height[right]) {

        // Check if current point is higher then max (new max) or lower (add water)
        if (height[left] >=  leftMax) {
          leftMax = height[left];
        } else {
          ans = ans + (leftMax - height[left]);
        }
        left++;
      } else {
        if (height[right] >= rightMax) {
          rightMax = height[right];
        } else {
          ans = ans + (rightMax - height[right]);
        }
        right--;
      }
    }

    return ans;
  }
}
