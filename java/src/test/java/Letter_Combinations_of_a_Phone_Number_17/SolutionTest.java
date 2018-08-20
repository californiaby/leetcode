package Letter_Combinations_of_a_Phone_Number_17;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void letterCombinations() {
    List<String> ans = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

    assertEquals(ans, solution.letterCombinations("23"));
  }
}