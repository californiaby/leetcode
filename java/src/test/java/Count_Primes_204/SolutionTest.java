package Count_Primes_204;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void countPrimes() {
    assertEquals(4, solution.countPrimes(10));
  }

  @Test
  public void two() {
    assertEquals(0, solution.countPrimes(2));
  }
}