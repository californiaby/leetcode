package gg.shipping;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LocUtils {
  public static int countAccessibleNeighborhoods(HashSet<Warehouse> set) {
    Set<Location> visited = new HashSet<>();
    Queue<Location> q = new LinkedList<>();
    int count = 0;

    for (Location loc : set) {
      q.add(loc);
    }

    while (!q.isEmpty()) {
      Location loc = q.poll();

      // Iterate through links
      for (Location link : loc.links) {

        // Ignore visited links
        if (!visited.contains(link)) {
          visited.add(link);

          if (link instanceof Neighborhood) {
            count++;
          } else {
            q.add(link);
          }
        }

      }
    }

    return count;
  }
}
