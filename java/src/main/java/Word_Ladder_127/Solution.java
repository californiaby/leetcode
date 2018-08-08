package Word_Ladder_127;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/*
Given two words (beginWord and endWord), and a dictionary's word list,
find the length of shortest transformation sequence from beginWord to endWord, such that:
Only one letter can be changed at a time.
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.

Note:
 - Return 0 if there is no such transformation sequence.
 - All words have the same length.
 - All words contain only lowercase alphabetic characters.
 - You may assume no duplicates in the word list.
 - You may assume beginWord and endWord are non-empty and are not the same.

Example 1:
Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

Output: 5

Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.
 */

/*
Solution
1. Basically, this problem is solved via two-way BFS - since we know start and end point.
2. Use two sets to store currently processed layer from end and start
3. On each iteration process the shortest of sets. Generate set of next words and assigne to startSet or endSet,
increase count
 */

public class Solution {
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

    Set<String> wordSet = new HashSet<>(wordList);
    Set<String> beginSet = new HashSet<>();
    Set<String> endSet = new HashSet<>();
    Set<String> visited = new HashSet<>();
    int step = 1;

    if (!wordSet.contains(endWord)) return 0;

    // add beginWord and endWord to corresponding sets + visited set
    beginSet.add(beginWord);
    endSet.add(endWord);
    visited.add(beginWord);
    visited.add(endWord);

    while (!beginSet.isEmpty() && !endSet.isEmpty()) {

      // define shorter set and work with it
      boolean isBeginSetShorter = beginSet.size() <= endSet.size();
      Set<String> small = isBeginSetShorter ? beginSet : endSet;
      Set<String> big = isBeginSetShorter ? endSet : beginSet;
      Set<String> next = new HashSet<>();
      step++;

      // go through each work of the shorter set
      for (String word : small) {

        // generate all possible combinations of characters
        for (int i = 0; i < word.length(); i++) {
          for (char c = 'a'; c <= 'z'; c++) {
            StringBuilder sb = new StringBuilder(word);
            sb.setCharAt(i, c);
            String newWord = sb.toString();

            // if longer set contains word - return the count
            if (big.contains(newWord)) return step;

            // check if word is in wordSet and hasn't been visited yet
            if (wordSet.contains(newWord) && !visited.contains(newWord)) {
              next.add(newWord);
              wordSet.remove(newWord);
            }
          }
        }
      }

      // at this moment, `next` contains list of next words and we are done processing smaller set
      // now we replace `small` with `next` and restart the iterations
      if (isBeginSetShorter) {
        beginSet = next;
      } else {
        endSet = next;
      }

    }

    return 0;
  }

}
