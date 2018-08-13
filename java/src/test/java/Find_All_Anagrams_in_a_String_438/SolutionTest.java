package Find_All_Anagrams_in_a_String_438;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void findAnagrams() {
    String s = "acdababcbcbba";
    String p = "abb";
    List<Integer> ans = Arrays.asList(4,10);

    assertEquals(ans, solution.findAnagrams(s, p));


  }
}