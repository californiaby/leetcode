package Sentence_Similarity_734;

/*
1. words1 and words2 contain arrays of words
2. pairs contain arrays of two words each that are a similarity match
3. we need to check if sentence 1 is similar to sentence 2 by the next rules
- each word in position N matches itself or it's pair in another string
- pairs are symmetric ([0] == [1] && [1] == [0[)
 */

import java.util.HashSet;

public class Solution {
  public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
    if (words1.length != words2.length) return false;

    // Ask if a word can have more than one pair. If no - use HashMap for each pair: A > B, B > A.

    // Store pairs in set for quick access
    HashSet<String> set = new HashSet<>();
    for (String[] pair: pairs) {
      set.add(pair[0] + ":" + pair[1]);
    }

    for (int i = 0; i < words1.length; i++) {
      if (!words1[i].equals(words2[i])
              && !set.contains(words1[i] + ":" + words2[i])
              && !set.contains(words2[i] + ":" + words1[i])) {
        return false;
      }
    }

    return true;
  }
}
