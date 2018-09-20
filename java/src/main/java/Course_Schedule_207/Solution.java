package Course_Schedule_207;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {

    // Use array to store inDegree of each node
    int[] inDegree = new int[numCourses];

    // Calculate inDegree for each course
    for (int i = 0; i < prerequisites.length; i++) {
      int course = prerequisites[i][0];
      inDegree[course]++;
    }

    Queue<Integer> q = new LinkedList<>();

    // Add nodes without prerequisites to the queue
    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] == 0) q.add(i);
    }

    // do BFS
    while (!q.isEmpty()) {
      int current = q.poll();

      for (int i = 0; i < prerequisites.length; i++) {
        int to = prerequisites[i][0];
        int from = prerequisites[i][1];

        if (current == from) {
          inDegree[to]--;

          if (inDegree[to] == 0) {
            q.add(to);
          }
        }
      }
    }

    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] != 0) return false;
    }

    return true;
  }
}
