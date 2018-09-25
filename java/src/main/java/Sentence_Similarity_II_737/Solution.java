package Sentence_Similarity_II_737;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {

    if (words1.length != words2.length) return false;
    Map<String, Integer> index = new HashMap<>();
    DSU dsu = new DSU(2 * pairs.length);
    int count = 0;

    for (String[] pair : pairs) {
      for (String w : pair) {
        if (!index.containsKey(w)) {
          index.put(w, count++);
        }
      }
      dsu.union(index.get(pair[0]), index.get(pair[1]));
    }

    for (int i = 0; i < words1.length; i++) {
      String w1 = words1[i];
      String w2 = words2[i];

      // Match in words => continue
      if (w1.equals(w2)) continue;

      // Neither in words is in the map (not in list of translations) => false
      if (!index.containsKey(w1) || !index.containsKey(w2)) return false;

      // Compare indexes from union find
      int i1 = index.get(w1);
      int i2 = index.get(w2);

      if (dsu.find(i1) != dsu.find(i2)) return false;
    }

    return true;
  }

  private class DSU {
    int[] parent;

    public DSU(int n) {
      this.parent = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
      }
    }

    public int find(int x) {
      if (this.parent[x] != x) {
        parent[x] = find(parent[x]);
      }
      return parent[x];
    }

    public void union(int x, int y) {
      parent[find(x)] = find(y);
    }

  }

}
