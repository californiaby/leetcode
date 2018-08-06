package amz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GetTopKElementsTest {

  GetTopKElements solution = new GetTopKElements();

  @Test
  public void nearestXsteakHouses() {
    List<List<Integer>> locations = new ArrayList<>();

    locations.add(Arrays.asList(1, 2));
    locations.add(Arrays.asList(2, 5));
    locations.add(Arrays.asList(3, 1));

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 2));
    expected.add(Arrays.asList(3, 1));

    assertEquals(expected, solution.nearestXsteakHouses(3, locations, 2));
  }

  @Test
  public void test_null() {
    assertEquals(null, solution.nearestXsteakHouses(3, null, 2));
  }

  @Test
  public void test_sameLocation() {
    List<List<Integer>> locations = new ArrayList<>();
    locations.add(Arrays.asList(0, 0));

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(0, 0));

    assertEquals(expected, solution.nearestXsteakHouses(1, locations, 1));
  }

  @Test
  public void test_negativeCoords() {
    List<List<Integer>> locations = new ArrayList<>();
    locations.add(Arrays.asList(-1, -2));
    locations.add(Arrays.asList(2, 3));

    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-1, -2));

    assertEquals(expected, solution.nearestXsteakHouses(2, locations, 1));
  }
}