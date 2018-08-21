package utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class TrieNodeTest {

  @Test
  public void insert() {
    TrieNode trie = new TrieNode();
    trie.insert("hello");

    assertTrue(trie.contains("hello"));
  }

  @Test
  public void contains() {
    TrieNode trie = new TrieNode();
    assertFalse(trie.contains("hello"));

    trie.insert("hello");

    assertTrue(trie.contains("hello"));
    assertFalse(trie.contains("help"));
    assertFalse(trie.contains("hellox"));
  }

  @Test
  public void deleteShorter() {
    TrieNode trie = new TrieNode();
    trie.insert("hello");
    trie.insert("hellocat");

    assertTrue(trie.contains("hello"));
    assertTrue(trie.contains("hellocat"));

    trie.delete("hello");

    assertFalse(trie.contains("hello"));
    assertTrue(trie.contains("hellocat"));
  }

  @Test
  public void deleteLonger() {
    TrieNode trie = new TrieNode();
    trie.insert("hello");
    trie.insert("hellocat");

    assertTrue(trie.contains("hello"));
    assertTrue(trie.contains("hellocat"));

    trie.delete("hellocat");

    assertTrue(trie.contains("hello"));
    assertFalse(trie.contains("hellocat"));
  }

  @Test
  public void get() {
    TrieNode trie = new TrieNode();
    trie.insert("hello");
    trie.insert("hellocat");
    trie.insert("helloworld");
    trie.insert("cat");

    LinkedList<String> exp = new LinkedList<>();
    exp.add("hello");
    exp.add("hellocat");
    exp.add("helloworld");

    assertEquals(exp, trie.get("hel"));
  }


}