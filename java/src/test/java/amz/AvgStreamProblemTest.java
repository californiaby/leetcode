package amz;

import org.junit.Test;
import utils.CustomStream;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class AvgStreamProblemTest {

  AvgStreamProblem solution = new AvgStreamProblem();

  @Test
  public void getAverageFromStream() {

    CustomStream stream = new CustomStream();
    stream.add(0);
    stream.add(1);
    stream.add(2);  // 3/3
    stream.add(3);  // 6/3
    stream.add(4);  // 9/3
    stream.add(5);  // 12/3
    stream.add(9);  // 18/3

    List<Integer> ans = new LinkedList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(4);
    ans.add(6);

    assertEquals(ans, solution.getAverageFromStream(stream, 3));
  }

  @Test
  public void handlenull() {


    List<Integer> ans = new LinkedList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(4);
    ans.add(6);

    assertEquals(ans, solution.getAverageFromStream(null, 3));
  }

  @Test
  public void handleshort() {
    CustomStream stream = new CustomStream();
    stream.add(0);
    stream.add(1);

    List<Integer> ans = new LinkedList<>();
    ans.add(1);
    ans.add(2);
    ans.add(3);
    ans.add(4);
    ans.add(6);

    assertEquals(ans, solution.getAverageFromStream(null, 3));
  }
}