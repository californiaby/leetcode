package keyboard_row_500;

import java.util.ArrayList;

public class Solution {

  public String[] findWords(String[] words) {
    String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    ArrayList<String> ans = new ArrayList<String>();

    for (String word : words) {

      for (String row : rows) {
        Boolean found = true;

        // Iterate through each char and check if they all match the row
        for (char c : word.toCharArray()) {
          if (row.indexOf(Character.toLowerCase(c)) == -1) {
            found = false;
            break;
          }
        }

        // Once done passing the row, add the word if it's valid
        if (found) {
          ans.add(word);
        }
      }
    }

    return ans.toArray(new String[ans.size()]);
  }

}
