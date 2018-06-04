package book;

public class StringCompression {

  public String compress(String s) {
    if (s.length() == 0) return s;
    if (s.length() == 1) return s + '1';

    StringBuilder sb = new StringBuilder();
    int p = 0;

    // p =         8
    //     aabcccccaaa
    // i =           0

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(p)) {
        sb.append(s.charAt(p));
        sb.append(i - p);
        p = i;
      }
    }

    sb.append(s.charAt(p));
    sb.append(s.length() - p);
    return sb.toString();
  }

}
