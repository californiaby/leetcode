package amz;

import java.util.*;

/*

Given a list of locations (each represented by list of two integers - x and y coordinates), find n locations
nearest to customer (who us located in [0,0] coordinates).

 */

public class GetTopKElements {

  public List<List<Integer>> nearestXsteakHouses(
          int totalSteakhouses,
          List<List<Integer>> allLocations,
          int numSteakhouses) {

    // Edge cases
    if (numSteakhouses > totalSteakhouses) return null;
    if (allLocations == null || allLocations.size() != totalSteakhouses || allLocations.size() == 0) return null;

    // Use data structure that stores coordinates and distance
    List<LocationAndDistance> locationsWithDistance = new ArrayList<>();

    // Populate with data from allLocations
    for (int i = 0; i < totalSteakhouses; i++) {
      List<Integer> location = allLocations.get(i);
      locationsWithDistance.add(new LocationAndDistance(location.get(0), location.get(1)));
    }

    // Sort locationsWithDistance by distance
    locationsWithDistance.sort((o1, o2) -> {
      return o1.distance > o2.distance ? 1 : -1;
    });

    // Get k shortest distances
    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 0; i < numSteakhouses; i++) {
      List<Integer> coordinates = new LinkedList<>();

      coordinates.add(locationsWithDistance.get(i).x);
      coordinates.add(locationsWithDistance.get(i).y);

      ans.add(coordinates);
    }

    return ans;
  }

  /**
   * Data structure used for storing coordinates and distance from [0,0] for each location.
   */
  private class LocationAndDistance {
    int x;
    int y;
    double distance;

    LocationAndDistance(int x, int y) {
      this.x = x;
      this.y = y;
      this.distance = Math.hypot(x, y); // use Math.hypot() to avoid integer overflow
    }
  }

}
