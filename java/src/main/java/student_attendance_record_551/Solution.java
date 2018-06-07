package student_attendance_record_551;

public class Solution {

  /*

  You are given a string representing an attendance record for a student.
  The record only contains the following three characters:
  'A' : Absent.
  'L' : Late.
  'P' : Present.
  A student could be rewarded if his attendance record doesn't contain
  more than one 'A' (absent) or more than two continuous 'L' (late).

  You need to return whether the student could be rewarded according to his attendance record.

  Example 1:
  Input: "PPALL" 0123
  Output: True

  Example 2:
  Input: "PPALLL"
  Output: False

   */

  public boolean checkRecord(String s) {

    boolean absent = false;

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == 'A') {

        // Check Absent case
        if (absent) {
          return false;
        } else {
          absent = true;
        }
      } else if (s.charAt(i) == 'L') {

        // Check Late case
        if (isLate(s, i)) {
          return false;
        }
      }

    }

  return true;
  }

  private boolean isLate(String s, int i) {

    // Check that remainder of the string isn't too short
    if (i + 2 > s.length() - 1) {
      return false;
    }

    if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
      return true;
    }

    return false;
  }

}
