package amz;

import utils.CustomStream;

import java.util.LinkedList;
import java.util.List;

public class AvgStreamProblem {

  public List<Integer> getAverageFromStream(CustomStream stream, int n) {

    if (stream == null || n <= 0) return null;

    LinkedList<Integer> ans = new LinkedList<>();

    LinkedList<Integer> list = new LinkedList<>();

    int curr = 0;
    int old = 0;
    int sum = 0;

    while (stream.hasNext()) {
      try {
        curr = stream.getNext();
      } catch (Exception e) {
        e.printStackTrace();
      }

      list.add(curr);
      sum = sum + curr;

      if (list.size() == n) {
        System.out.println(sum / n);
      } else if (list.size() > n) {
        old = list.poll();
        sum = sum - old;
        System.out.println(sum / n);
      }

    }

    return ans;
  }
}
