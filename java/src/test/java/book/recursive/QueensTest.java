package book.recursive;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QueensTest {

  Queens solution = new Queens();

  @Test
  public void magicQueens() {
    List<Integer[]> ans = solution.magicQueens();
    System.out.println(ans);
  }
}