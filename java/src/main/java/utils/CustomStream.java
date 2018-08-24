package utils;

import java.util.ArrayList;

public class CustomStream{
  ArrayList<Integer> arr;

  public CustomStream() {
    this.arr = new ArrayList<>();
  }

  public void add(int v) {
    this.arr.add(v);
  }

  public boolean hasNext() {
    return this.arr.size() > 0;
  }

  public int getNext() throws Exception {
    if (!hasNext()) {
      throw new Exception("No next element");
    } else {
      int v = arr.get(0);
      arr.remove(0);
      return v;
    }
  }

}