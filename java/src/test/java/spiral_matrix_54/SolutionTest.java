package spiral_matrix_54;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void spiralOrder() {
    int[][] arr = new int[5][4];
    arr[0] = new int[] {1,2,3,4};
    arr[1] = new int[] {5,6,7,8};
    arr[2] = new int[] {9,10,11,12};
    arr[3] = new int[] {13,14,15,16};
    arr[4] = new int[] {17,18,19,20};

    List<Integer> ans = new ArrayList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(4);
    ans.add(8);
    ans.add(12);
    ans.add(16);
    ans.add(20);
    ans.add(19);
    ans.add(18);
    ans.add(17);
    ans.add(13);
    ans.add(9);
    ans.add(5);
    ans.add(6);
    ans.add(7);
    ans.add(11);
    ans.add(15);
    ans.add(14);
    ans.add(10);

    assertEquals(ans, solution.spiralOrder(arr));
  }

  @Test
  public void square() {
    int[][] arr = new int[3][3];
    arr[0] = new int[] {1,2,3};
    arr[1] = new int[] {4,5,6};
    arr[2] = new int[] {7,8,9};

    List<Integer> ans = new ArrayList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(6);
    ans.add(9);
    ans.add(8);
    ans.add(7);
    ans.add(4);
    ans.add(5);

    assertEquals(ans, solution.spiralOrder(arr));
  }

  @Test
  public void threefour() {
    int[][] arr = new int[3][4];
    arr[0] = new int[] {1,2,3,10};
    arr[1] = new int[] {4,5,6,11};
    arr[2] = new int[] {7,8,9,12};

    List<Integer> ans = new ArrayList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(10);
    ans.add(11);
    ans.add(12);
    ans.add(9);
    ans.add(8);
    ans.add(7);
    ans.add(4);
    ans.add(5);
    ans.add(6);

    assertEquals(ans, solution.spiralOrder(arr));
  }
}