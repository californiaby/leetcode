package Moving_Average_from_Data_Stream_346;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

  Queue<Integer> data;
  int size;
  double sum;

  /** Initialize your data structure here. */
  public MovingAverage(int size) {
    this.data = new LinkedList<Integer>();
    this.size = size;
  }

  public double next(int val) {
    sum += val;
    data.add(val);

    if (data.size() > this.size) {
      sum -= data.remove();
    }

    return sum / (Math.min(this.size, data.size()));
  }

}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */