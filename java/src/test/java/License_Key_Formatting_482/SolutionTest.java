package License_Key_Formatting_482;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void licenseKeyFormatting() {
    String s = "5F3Z-2e-9w";
    String exp = "5F3Z-2E9W";

    assertEquals(exp, solution.licenseKeyFormatting(s, 4));
  }
}