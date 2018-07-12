package find_median_from_data_stream_295;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianFinderTest {

  MedianFinder finder;

  @Test
  public void test() {

    finder = new MedianFinder();
    finder.addNum(1);
    finder.addNum(2);
    finder.addNum(3);
    finder.addNum(4);
    finder.addNum(5);

//    assertEquals(new double[3 / 2], finder.findMedian());
    double ans = finder.findMedian();

    finder.addNum(10);

//    assertEquals(new double[2], finder.findMedian());

    ans = finder.findMedian();
  }
}