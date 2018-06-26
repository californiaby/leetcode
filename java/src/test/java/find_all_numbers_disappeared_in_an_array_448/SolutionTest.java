package find_all_numbers_disappeared_in_an_array_448;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void findDisappearedNumbers() {
    int[] arr = new int[] {4,3,2,7,8,2,3,1};
    Integer[] expArr = new Integer[] {5,6};
    List asList = Arrays.asList(expArr);

    assertEquals(asList, solution.findDisappearedNumbers(arr));
  }
}