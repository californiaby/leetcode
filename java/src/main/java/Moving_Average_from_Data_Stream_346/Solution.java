package Moving_Average_from_Data_Stream_346;

import java.util.LinkedList;

public class Solution {

    // 1 [2, 3, 4]
    // next (4)
    // add the element: 4
    // check the size(). if exceeds the limit, pop the head
    // calculate the sum, store (1+2+3) + 4 - 1
    // return sum / size()

    int size;
    int windowSum = 0;
    LinkedList<Integer> data = new LinkedList<>();

    public Solution(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        data.add(val);

        // Data exceeds the limit, need to remove the head
        Integer head = data.size() > this.size ? data.pollFirst() : 0;
        
        // WindowSum is increased by the current value, and potentially decreased by evicted head
        windowSum = windowSum + val - head;

        return windowSum * 1.0 / data.size();
    }
    
}
