package ransom_note_338;

import java.util.HashMap;

public class Solution {

  /*

  Given an arbitrary ransom note string and another string containing letters from all the magazines,
  write a function that will return true if the ransom note can be constructed from the magazines ;
  otherwise, it will return false.

  Each letter in the magazine string can only be used once in your ransom note.

  Note:
  You may assume that both strings contain only lowercase letters.

  canConstruct("a", "b") -> false
  canConstruct("aa", "ab") -> false
  canConstruct("aa", "aab") -> true

   */

  public boolean canConstruct(String ransomNote, String magazine) {

    if (ransomNote.length() > magazine.length() || magazine.length() == 0) return false;
    if (ransomNote.length() == 0) return true;

    // if letters are only ASCII - we can use arr[128] to store count of letters in magazine
    // for flexibility - use map and count letters
    // it's also possible to use list, but Big (O) is lower

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    // Iterate through magazine and map every char with count
    for (char c : magazine.toCharArray()) {
      Integer count = map.get(c);
      map.put(c, count == null ? 1 : count + 1);
    }

    // Iterate through note, for each char get value from map
    for (char c : ransomNote.toCharArray()) {
      Integer count = map.get(c);

      // if value isn't in the map or current count is 0 => return false
      if (count == null || count == 0) return false;
      map.put(c, count - 1);
    }

    return true;
  }

}
