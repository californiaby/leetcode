package Robot_Room_Cleaner_489;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public void cleanRoom(Robot robot) {
    Set<String> set = new HashSet<>();
    backtrack(robot, set, 0, 0, 0);
  }

  private void backtrack(Robot robot, Set<String> set, int row, int col, int direction) {
    String location = row + "->" + col;
    if (set.contains(location)) {
      return;
    }

    robot.clean();
    set.add(location);

    for (int i = 0; i < 4; i++) {
      int tempRow = row;
      int tempCol = col;

      // Try moving forward - taking direction into account
      if (robot.move()) {
        // Can go directly - update the location and run recursively
        switch (direction) {
          case 0:
            // Go up
            tempRow--;
            break;
          case 90:
            // Go right
            tempCol++;
            break;
          case 180:
            // Go down
            tempRow++;
            break;
          case 270:
            // Go left
            tempCol--;
            break;
        }

        String newLocation = tempRow + "->" + tempCol;
        if (!set.contains(newLocation)) backtrack(robot, set, tempRow, tempCol, direction);

        // Once done with DFS - return to previous location and previous direction
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
      }

      // Try next direction
      robot.turnRight();
      direction = (direction + 90) % 360;
    }
  }
}
