package ZigZag_Conversion_6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public String convert(String s, int numRows) {
    List<StringBuilder> list = new ArrayList<>();

    if (numRows <= 1) return s;

    // Initialize StringBuilders
    for (int i = 0; i < numRows; i++) {
      list.add(new StringBuilder());
    }

    int currentRow = 0;
    boolean grow = false;

    // Iterate the string
    for (char c : s.toCharArray()) {
      // Add current char to StringBuilder
      list.get(currentRow).append(c);

      // Update the direction if neccessary
      if (currentRow == numRows-1 || currentRow == 0) grow = !grow;

      // Update the pointer
      currentRow = grow ? currentRow+1 : currentRow-1;
    }

    StringBuilder ans = new StringBuilder();

    for (StringBuilder currSb : list) {
      ans.append(currSb);
    }

    return ans.toString();
  }
}
