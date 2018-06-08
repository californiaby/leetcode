package reverse_vowels_of_a_string_345;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

  /*

  Write a function that takes a string as input and reverse only the vowels of a string.

  Example 1:
  Given s = "hello", return "holle".

  Example 2:
  Given s = "leetcode", return "leotcede".

  Note:
  The vowels does not include the letter "y".

   */

  public String reverseVowels(String s) {

    // 'a', 'e', 'i', 'o', 'u'

    HashSet<Character> set = new HashSet<> (Stream.of('a', 'e', 'i', 'o', 'u').collect(Collectors.toSet()));
    ArrayList<Integer> arr = new ArrayList();
    char[] chars = s.toCharArray();
    int n = 0;

    for (int i = 0; i < chars.length; i++) {
      if (set.contains(Character.toLowerCase(chars[i]))) {
        arr.add(i);
        n++;
      }
    }

    for (int i = 0; i < n / 2; i++) {
      int start = arr.get(i);
      int end = arr.get(n - 1 - i);

      char temp = chars[start];
      chars[start] = chars[end];
      chars[end] = temp;
    }

    return String.valueOf(chars);
  }

  public String reverseVowelsTwoPointers(String s) {

    boolean[] arr = new boolean[123];
    arr['a'] = true;
    arr['e'] = true;
    arr['i'] = true;
    arr['o'] = true;
    arr['u'] = true;
    arr['A'] = true;
    arr['E'] = true;
    arr['I'] = true;
    arr['O'] = true;
    arr['U'] = true;

    char[] str = s.toCharArray();
    int l = 0;
    int r = str.length - 1;

    while (l <= r) {
      while (l < r && !arr[str[l]]) {
        l++;
      }
      while (l < r && !arr[str[r]]) {
        r--;
      }
      if (l < r) {
        char t = str[l];
        str[l] = str[r];
        str[r] = t;
      }
      l++;
      r--;
    }
    return String.valueOf(str);
  }

}
