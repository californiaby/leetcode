package Isomorphic_Strings_205;

public class Solution {
  public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> sMap = new HashMap<>();
    Map<Character, Character> tMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);

      if (!sMap.containsKey(sChar) && !tMap.containsKey(tChar)) {
        // No keys for both => OK, add
        sMap.put(sChar, tChar);
        tMap.put(tChar, sChar);
      } else if (sMap.containsKey(sChar) && tMap.containsKey(tChar)) {
        // Contains both keys - compare
        if (sMap.get(sChar) != tChar || tMap.get(tChar) != sChar) return false;
      } else {
        // Contains only one key
        return false;
      }
    }
    return true;
  }

  private boolean alt(String s, String t) {
    int[] sChars = new int[256];
    int[] tChars = new int[256];

    for (int i = 0; i < s.length(); i++) {
      if (sChars[s.charAt(i)] != tChars[t.charAt(i)]) return false;
      sChars[s.charAt(i)] = i+1;
      tChars[t.charAt(i)] = i+1;
    }

    return true;
  }
}
