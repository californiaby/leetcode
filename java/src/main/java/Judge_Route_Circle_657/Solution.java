package Judge_Route_Circle_657;

public class Solution {
  public boolean judgeCircle(String moves) {
    if (moves == null) return true;
    int x = 0, y = 0;

    // Double check if we need to handle lowercase and incorrect chars
    for (char c : moves.toCharArray()) {
      if (c == 'U') y++;
      else if (c == 'D') y--;
      else if (c == 'R') x++;
      else if (c == 'L') x--;
    }

    return x == 0 && y == 0;
  }
}
