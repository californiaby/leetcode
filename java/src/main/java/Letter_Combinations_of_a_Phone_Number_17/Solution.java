package Letter_Combinations_of_a_Phone_Number_17;

import java.util.*;

public class Solution {
  String[] keys = {"","","abc","def","ghi","jkl","mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    List<String> ans = new LinkedList<>();
    if (digits == null || digits.length() == 0) return ans;

    generateCombinations(digits, 0, "", ans);
    return ans;
  }
  
  /**
   * Recursive solution:
   * 1. get the current number => 2
   * 2. run cycle for each digit with this number, get chars => a, b, c
   * 3. in each cycle - call recursive function
   * 4. when reached the end of string => return current prefix
   * @param digits represents the phone number that is used for generation of List
   * @param offset represents the position in number that is currently being processed
   * @param prefix represents already processed part that has been generated
   * @param ans List with answers, populated when generated sequence is ling enough
   */
  private void generateCombinations(String digits, int offset, String prefix, List<String> ans) {
    // Handle case when result is as long as digits
    if (offset >= digits.length()) {
      ans.add(prefix);
      return;
    }

    // Get the current number
    int currentNumber = digits.charAt(offset) - '0';
    String currentLetters = keys[currentNumber];

    // Run cycle for each char associated with current number, while appending current char to prefix
    for (char c : currentLetters.toCharArray()) {
      generateCombinations(digits, offset + 1, prefix + c, ans);
    }
  }

}
