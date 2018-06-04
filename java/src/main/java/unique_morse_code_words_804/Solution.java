package unique_morse_code_words_804;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int uniqueMorseRepresentations(String[] words) {

    String[] code = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    Set<String> set = new HashSet<String>();

    for (String word : words) {
      StringBuilder sb = new StringBuilder();

      // Iterate through character of the word for each char get index and get code[index]
      for (char c : word.toCharArray()) {
        // Since words[i] will only consist of lowercase letters. - no need for Character.toLowerCase
        // No need to case `(int) c - 97` - just substract 'a'
        int index = c - 'a';
        // int index = (int) Character.toLowerCase(c) - 97;
        sb.append(code[index]);
      }
      // Convert sb to String and add to set
      set.add(sb.toString());
    }

    return set.size();
  }

}
