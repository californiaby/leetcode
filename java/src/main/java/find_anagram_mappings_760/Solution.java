package find_anagram_mappings_760;

/*

Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made
by randomizing the order of the elements in A.
We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element
n A appears in B at index j.
These lists A and B may contain duplicates. If there are multiple answers, output any of them.

For example, given
A = [12, 28, 46, 32, 50]
B = [50, 12, 32, 46, 28]
We should return
[1, 4, 3, 2, 0]
 */

import java.util.HashMap;

public class Solution {

  public int[] anagramMappings(int[] A, int[] B) {

    // hastable allows O(n) time complexity
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < B.length; i++) {
      map.put(B[i], i);
    }

    // we know the length so can create array instead of aArrayList
    int[] ans = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      ans[i] = map.get(A[i]);
    }

    return ans;
  }

}
