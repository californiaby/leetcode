package utils;

public class Sorting {

  /**
   * Bubble sorting algo.
   * For each element compare value to following. if a > b => swap.
   * By the end of first cycle the max element is the biggest in the array, so next cycle needs to be shorter.
   * Time complexity O(n^2)
   * @param arr
   */
  public void bubble(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // ======================================================

  /**
   * Insertion sorting algo.
   * Start with second element, we iterate through array. The goal is to make sure that to the left of the pointer
   * there's a sorted part of the arr. If current element is smaller than left parts last element (max), we iterate back
   * through the sorted part and look for a right place to insert current value.
   * Time complexity O(n^2)
   * @param arr
   */
  public void insertion(int[] arr) {
    int n = arr.length;

    // From second element and till the end
    for (int i = 1; i < n; i++) {
      int key = arr[i]; // current value
      int j = i - 1; // previous element

      while (j >= 0 && arr[j] > key) {

        // shift sorted part of arr right for 1 element
        arr[j + 1] = arr[j];
        j = j - 1;
      }

      // insert current value (re-inserted into same position if nothing is shifted)
      arr[j + 1] = key;
    }
  }

  // ======================================================

  /**
   * MergeSort algo.
   * @param arr
   */
  public void mergeSort(int[] arr) {
    int n = arr.length - 1;
    doMergeSort(arr, 0, n);
  }

  /**
   * Recursive mergeSort function.
   * @param arr
   * @param l
   * @param r
   */
  private void doMergeSort(int[] arr, int l, int r) {
    if (l < r)  {
      // Find the middle point
      int m = (l + r) / 2;

      // Sort left and right parts
      doMergeSort(arr, l, m);
      doMergeSort(arr, m + 1, r);

      // Merge left and right parts
      doMerge(arr, l, m, r);
    }
  }

  /**
   * Merges two parts of array.
   * @param arr
   * @param l
   * @param m
   * @param r
   */
  private void doMerge(int[] arr, int l, int m, int r) {
    // Find sizes of subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    // Create temp arrays
    int[] tempLeft = new int[n1];
    int[] tempRight = new int[n2];

    // Store values in temp arrays
    for (int i = 0; i < n1; i++) {
      tempLeft[i] = arr[l + i];
    }
    for (int i = 0; i < n2; i++) {
      tempRight[i] = arr[m + 1 + i];
    }

    /*
    // Alternative - use System function for copying array
    System.arraycopy(arr, l, tempLeft, 0, n1);
    System.arraycopy(arr, m + 1, tempRight, 0, n2);
    */

    // Merge two arrays one-by-one
    int a = 0;
    int b = 0;
    int i = l;

    while (a < n1 || b < n2) {
      int lVal = a < n1 ? tempLeft[a] : Integer.MAX_VALUE;
      int rVal = b < n2 ? tempRight[b] : Integer.MAX_VALUE;

      if (lVal < rVal) {
        arr[i] = lVal;
        a++;
      } else {
        arr[i] = rVal;
        b++;
      }
      i++;
    }
  }

  // ======================================================

}
