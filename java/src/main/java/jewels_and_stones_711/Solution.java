package jewels_and_stones_711;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 771. Jewels and Stones.
 */
public class Solution {

  /**
   * Returns count of jewels in string s.
   * @param j {String} represents list of jewels
   * @param s {String} represents list of stones
   * @return {int} count of jewels in stones String
   */
  public int getJewelsCount(String j, String s) {

    if (j == null || s == null || j.length() == 0 || s.length() == 0) return 0;

    int ans = 0;
    List list = new ArrayList();

    // Iterate over j and create a Set of jewels
    for (int i = 0; i < j.length(); i++) {
      list.add(j.charAt(i));
    }

    for (int i = 0; i < s.length(); i++) {
      if (list.contains(s.charAt(i))) {
        ans++;
      }
    }

    return ans;
  }

  public int getJewelsArray(String j, String s) {

    int ans = 0;
    for (char stone : s.toCharArray()) {
      if (j.indexOf(stone) != -1) {
        ans++;
      }
    }
    return ans;
  }

}
