package Search_in_Rotated_Sorted_Array_33;

public class Solution {
  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) return -1;
    int ans = search(nums, 0, nums.length-1, target);
    return ans;
  }

  private int search(int[] arr, int low, int high, int t) {
    if (low >= high) {
      return arr[high] == t ? high : -1;
    }

    // Get the mid pointer - [0] element of right half
    int mid = (low + high) / 2;

    if (arr[mid] == t) return mid;

    // Check which half is normally sorted
    if (arr[low] < arr[mid]) {
      // Left is normal, check if target number is within it's limits
      if (t >= arr[low] && t <= arr[mid]) {
        // Target is within normal part's boundaries, run the search for this half
        return search(arr, low, mid, t);
      } else {
        // Target is not within normal part's boundaries, run the search for the other half
        return search(arr, mid+1, high, t);
      }
    } else {
      // Right is the normal part
      if (t >= arr[mid+1] && t <= arr[high]) {
        return search(arr, mid+1, high, t);
      } else {
        return search(arr, low, mid, t);
      }
    }
  }
}
