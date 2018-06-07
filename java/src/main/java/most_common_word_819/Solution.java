package most_common_word_819;

/*

Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.
Words in the paragraph are not case sensitive.  The answer is in lowercase.

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

  /**
   * Counts list of most common non-banned words.
   * @param paragraph
   * @param banned
   * @return
   */
  public String mostCommonWord(String paragraph, String[] banned) {

    // Split into array of Strings, each containing a word.
    // Use regex \W+: {\W } - not word, and grouping {+}
    String[] words = paragraph.split("\\W+");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    HashSet<String> banSet = new HashSet<String>();
    int maxCount = 0;
    String maxWord = "";

    // Populate set of banned words
    for (String banWord : banned) {
      banSet.add(banWord);
    }

    // Iterate through array of words and count non-banned
    for (String word : words) {
      word = word.toLowerCase();
      if (!banSet.contains(word)) {
        Integer n = map.get(word);
        map.put(word, n == null ? 1 : n + 1);
      }
    }

    // Iterate through map
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      Integer count = entry.getValue();

      if (count > maxCount) {
        maxCount = count;
        maxWord = key;
      }
    }

    return maxWord;

    /*
    Things to consider:

    1. We can store all words in map (including banned) and run the ban-check only when we return thew result.
    This approach is better if we want to implement a solution that stores count for already processes text
    and expect banList to be flexible.

    2. We can remove iteration through the map by having maxCount and maxName variables. Each time when word is added,
    we need to check if count is higher than current max. We also need to check that word isn't banned during
    an addition.
     */

  }

}
