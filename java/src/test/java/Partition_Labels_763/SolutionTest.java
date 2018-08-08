package Partition_Labels_763;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void partitionLabels() {
    String s = "abababcdeed";
    assertEquals(Arrays.asList(6,1,4), solution.partitionLabels(s));
  }
}