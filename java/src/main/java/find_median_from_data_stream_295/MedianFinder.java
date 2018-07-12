package find_median_from_data_stream_295;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {

  private Queue<Integer> min;
  private Queue<Integer> max;

  /** initialize your data structure here. */
  public MedianFinder() {
    min = new PriorityQueue();
    max = new PriorityQueue(Collections.reverseOrder());
  }

  public void addNum(int num) {
    max.add(num);
    min.add(max.poll());
    if (max.size() < min.size()) {
      max.add(min.poll());
    }
  }

  public double findMedian() {
    if (max.size() == min.size()) {
      return ((max.peek() + min.peek()) / 2.0);
    } else {
      return  max.peek();
    }
  }

}
