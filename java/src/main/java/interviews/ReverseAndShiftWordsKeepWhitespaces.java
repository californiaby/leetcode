package interviews;

/*

#1 Given a string, preserve the spaces where they are and reverse the words.
Example: “     hello   world   David  ”  --> “     olleh   dlrow   divaD  ”

#2 Shift the words to the right.
Example: “     hello   world   David  ”  --> “     divaD   olleh   dlrow  ”

 */
import java.util.ArrayList;

public class ReverseAndShiftWordsKeepWhitespaces {

  /*
  This problem can be divided into separate problems:
  1. Reverse the word
  2. Parse the initial string to get list of "words" and "whitespaces" - keep length of whitespaces
  3. Do the shift
  3.1 keep in mind that whitespaces aren't moving, only words are
  3.2 keep in mind that words may have different length

  Notes:
  - String in Java is immutable, so we shouldn't modify it directly - any insertion / deletion will create a new String
  - We want to generate final string just once - before we return it
  - We need to use data structure that can store String ("whitespaces" and "words"), maintain order,
  and provide possibility to quickly modify data (shift words)

  Thinking process:

  Reverse String:
  - there are multiple ways to do that, each has pros and cons
  - better readability: StringBuilder sb = new StringBuilder(str).reverse(); Time complexity: O (n)
  - in place: convert String to char array > two pointers, swap; Time complexity: O (n)
  - reverse iteration: convert to char array, append to StringBuilder char-by-char from the end (or populate another
    array); Time complexity: O (n)
  - recursive: append the last char to StringBuilder and call same function for substring without the last char

  Parse String:
  - we can get array of words using regex: str.split("\\s+") - splits by spaces, grouped
  - but we also need to know the length of "whitespaces" - so we'll have to run string.split once again to get that info
  - after that we'll have two arrays with valid length but without information about order - so this doesn't work for us
  - we can use three pointers to iterate through the string and find
  -- beginning of the "whitespaces"
  -- beginning of the "word"
  -- end of the "word"
  - with this info we can split initial string with substrings and do it in-order

  Store parsed data:
  - we need a data structure that maintains order
  - during the solution we'll need to add elements, and then shift them (shifting means: get > delete > add), so we
  need a data structure that has good Time complexity for these purposes
  - We'll use List to store parsed data
  -- ArrayList is a resizable array, provides O(1) for get and set functions
  -- LinkedList is double linked list. Provides O(1) add/remove/set functions, but O(n) to get an element
  -- ArrayList is a preferred data structure for this problem

  Modify parsed data:
  - if we are sure that shifting will happen just once - we can save indeces of "words" when we add them
  - I'll implement a reusable function that allows to iterate ArrayList once before shifting - so that it can be reused
    for shifting again

  PS:
  I am using additional variables for better readability.
   */

  public String reverseAndShift(String s) {

    if (s.length() <= 1) return s;

    ArrayList<String> arr = new ArrayList<>();

    int sp = 0;
    int start = 0;
    int end = 0;
    char[] str = s.toCharArray();

    // Iterate through the initial string
    while (start < str.length) {

      // move start pointer until it reaches end; then move until it reaches non-space char
      while (start < end || start < str.length && str[start] == ' ') {
        start++;
      }

      // move end pointer until it reaches start; then move until it points to space char
      while (end < start || end < str.length && str[end] != ' ') {
        end++;
      }

      // sp is pointing to the "previous" sequence of spaces
      // start is pointing to the first char of the word
      // end is pointing to the first space after the word

      // store spaces sequence
      String spaces = s.substring(sp, start); // O(n)
      arr.add(spaces); // O(1)

      // store word
      String word = s.substring(start, end); // O(n)
      word = reverse(word);
      arr.add(word); // O(1)

      // move spaces pointer
      sp = end;

    }

    arr = shiftWords(arr);

    StringBuilder sb = new StringBuilder();
    for (String element : arr) {
      sb.append(element);
    }

    return sb.toString();
  }

  /**
   * Reverses String using two pointers swap
   * @param word string ti be reversed
   * @return String
   */
  private static String reverse(String word) {
    return new StringBuilder(word).reverse().toString();
  }

  /**
   * Shifts words in ArrayList consisting of Strings with words and spaces.
   * @param list represent list of words and spaces
   * @return modified ArrayList
   */
  private static ArrayList shiftWords(ArrayList<String> list) {

    String prev = null;
    int firstIndex = -1;

    for (int i = 0; i < list.size(); i++) {
      String element = list.get(i);

      // if "word"
      if (element.length() > 0 && element.charAt(0) != ' ') {
        if (prev == null) {
          // found the first word
          prev = element;
          firstIndex = i;
        } else {
          // move previous word to current position in the ArrayList
          String temp = element;
          list.set(i, prev);
          prev = temp;
        }
      }
    }

    // move stored word into the saved position
    if (prev != null) {
      list.set(firstIndex, prev);
    }

    return list;
  }

}