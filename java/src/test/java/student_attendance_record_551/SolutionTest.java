package student_attendance_record_551;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void checkRecord() {
    assertTrue(solution.checkRecord("PPALL"));
  }

  @Test
  public void checkRecord_late() {
    assertFalse(solution.checkRecord("PPALLL"));
  }

  @Test
  public void checkRecord_absent() {
    assertFalse(solution.checkRecord("PPLLAPPLLA"));
  }

}