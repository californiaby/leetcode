package utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

  Sorting sorting = new Sorting();
  int[] arr;
  int[] exp;

  @Before
  public void setup() {
    arr = new int[] {3, 1, 5, 4, 2};
    exp = new int[] {1, 2, 3, 4, 5};
  }

  @Test
  public void bubble() {
    sorting.bubble(arr);

    assertArrayEquals(exp, arr);
  }

  @Test
  public void insertion() {
    sorting.insertion(arr);

    assertArrayEquals(exp, arr);
  }

  @Test
  public void merge() {
    sorting.mergeSort(arr);

    assertArrayEquals(exp, arr);
  }
}