package book;

public class StringUrlify {

  /**
   * Modify String by replacing space symbols with "%20".
   * We assume that String has n spaces in the end to hold replacement.
   * @param str
   * @return
   */
  public String urlify(String str) {

    if (str == null || str.length() == 0) return "";

    char[] chars = str.toCharArray();

    int count = 0;

    // Get amount of spaces in string
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == ' ') {
        count++;
      }
    }

    // Check if String has right amount of placeholder spaces
    if (count % 3 != 0) throw new Error("Original String doesn't have right amount of placeholder spaces");

    // Get pointer to end of string (before placeholder spaces)
    int trueLength = chars.length - (count * 2 / 3);
    int p = trueLength - 1;

    // |0123456789012
    // |Oh hi lol    |
    // |    ^
    // |       %20lol|
    // |       ^

    for (int i = chars.length - 1; i >= 0; i--) {
      if (chars[p] == ' ') {
        chars[i] = '0';
        chars[i - 1] = '2';
        chars[i - 2] = '%';
        i = i - 2;
        p--;
      } else {
        chars[i] = chars[p];
        p--;
      }
    }

    return String.valueOf(chars);
  }

}
