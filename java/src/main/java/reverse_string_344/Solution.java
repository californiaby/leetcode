package reverse_string_344;

public class Solution {

  /** StringBuilder approach.
   *
   * @param s
   * @return
   */
  public String reverseString(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
  }

  /**
   * StringBuilder + pointer.
   *
   * @param s
   * @return
   */
  public String reversePointer(String s) {
    StringBuilder sb = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--) {
      sb.append(s.charAt(i));
    }

    return sb.toString();
  }

  /**
   * In place, two pointers, temp.
   * @param s
   * @return
   */
  public String reverseInplace(String s) {
    char[] arr = s.toCharArray();
    int len = arr.length - 1;
    int mid = (len + 1) / 2;

    for (int i = 0; i < arr.length / 2; i++) {
      char temp = arr[i];
      arr[i] = arr[len - i];
      arr[len - i] = temp;
    }

    return String.valueOf(arr);
  }

  /**
   * Recursive.
   * @param s
   * @return
   */
  public String reverseRecursive(String s) {
    if (s.length() < 2) return s;

    return reverseRecursive(s.substring(1)) + s.charAt(0);
  }
}
