package utils;

import java.util.*;

public class TrieNode {
  private HashMap<Character, TrieNode> children;
  private boolean isWord;
  private char c;

  /**
   * Initializes TrieNode with root value `#`.
   */
  public TrieNode() {
    this.c = '#';
    this.isWord = false;
    this.children = new HashMap<>();
  }

  /**
   * Initializes the new Trie.
   */
  public TrieNode (char c) {
    this.c = c;
    this.isWord = false;
    this.children = new HashMap<>();
  }

  /**
   * Inserts a word into the Trie.
   * @param word
   */
  public void insert (String word) {
    TrieNode current = this;

    for (char c : word.toCharArray()) {
      if (!current.children.containsKey(c)) {
        current.children.put(c, new TrieNode(c));
      }
        current = current.children.get(c);
    }

    current.isWord = true;

  }

  /**
   * Checks if trie contains a give word.
   * @param word
   * @return
   */
  public boolean contains (String word) {
    TrieNode current = this;

    for (char c : word.toCharArray()) {
      if (!current.children.containsKey(c)) return false;
      current = current.children.get(c);
    }

    return (current.c == word.charAt(word.length()-1) && current.isWord);
  }

  /**
   * Checks if trie contains a give prefix.
   * @param word
   * @return
   */
  public boolean containsPrefix (String word) {
    TrieNode current = this;

    for (char c : word.toCharArray()) {
      if (!current.children.containsKey(c)) return false;
      current = current.children.get(c);
    }

    return current.c == word.charAt(word.length()-1);
  }

  /**
   * Deletes a word from trie.
   * @param word
   */
  public void delete (String word) {
    TrieNode current = this;
    if (!current.contains(word)) return;

    Stack<TrieNode> stack = new Stack<>();

    // Iterate through trie to the end of word and store sequence of nodes in stack
    for (char c : word.toCharArray()) {
      current = current.children.get(c);
      stack.push(current);
    }

    // Current points to the last node
    // Remove isWord flag
    current.isWord = false;

    // Now, if there are no children, move back through the stack and delete nodes until we find end of another word
    if (current.children.isEmpty()) {
      while (!current.isWord) {
        current = null;
        current = stack.pop();
      }
    }
  }

  /**
   * Gets all words that can be found with given prefix.
   * @param prefix
   * @return
   */
  public List<String> get(String prefix) {
    TrieNode current = this;
    LinkedList<String> list = new LinkedList<>();

    if (current.containsPrefix(prefix)) {
      for (char c : prefix.toCharArray()) {
        current = current.children.get(c);
      }

      generateListOfWords(current, prefix, list);
    }

    return list;
  }

  /**
   * Generates a list of words starting with given prefix.
   * @param current points to node representing the last letter of the prefix.
   * @param prefix
   * @param list
   */
  private void generateListOfWords(TrieNode current, String prefix, LinkedList<String> list) {
    if (current.isWord) {
      list.add(prefix);
    }

    for (Character key : current.children.keySet()) {
      TrieNode next = current.children.get(key);
      generateListOfWords(next, prefix + key, list);
    }
  }
}
