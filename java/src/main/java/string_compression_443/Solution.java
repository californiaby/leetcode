package string_compression_443;

public class Solution {

//  public int compress(char[] chars) {
//
//    int anchor = 0;
//    int write = 0;
//
//    for (int read = 0; read < chars.length; read++) {
//      if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
//        chars[write++] = chars[anchor];
//        if (read > anchor) {
//          for (char c : ("" + (read - anchor + 1)).toCharArray()) {
//            chars[write++] =  c;
//          }
//        }
//        anchor = read + 1;
//      }
//    }
//  return write;
//  }

  public int compress(char[] chars) {

    int anchor = 0;
    int write = 0;

    // Read every character in string
    for (int read = 0; read < chars.length; read++) {

      // compare to next char or end of string
      if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
        // found end of sequence

        // write letter first and inc write pointer
        chars[write] = chars[anchor];
        write++;

        // if more than one letter in sequence - get length and write as chars
        if (read > anchor) {
          int n = read - anchor + 1;
          char[] arr = ("" + n).toCharArray();
          for (char c : arr) {
            chars[write] = c;
            write++;
          }
        }

        // move anchor to next symbol after current read
        anchor = read + 1;
      }
    }

    // write points on last symbol of compressed string
    return write;
  }


}
