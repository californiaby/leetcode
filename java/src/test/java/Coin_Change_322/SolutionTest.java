package java.coin_change_322;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test() {
        int ans = coinChange(new int[1,2,5], 11);
        assertEquals(ans, 5);
    }

}