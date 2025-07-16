package Find_Triangular_Sum_of_an_Array_2221;

// 1 2 3 4 5 -- i = 0
// 3 5 7 9 -- 
// 1 2 3
// 1 2
// 1

class Solution {
    public int triangularSum(int[] nums) {
        int[] temp = nums;
        int totalRuns = nums.length - 1;

        for (int i = 0; i < totalRuns; i++) {
            for (int j = 0; j < nums.length - i - 1; j++ ) {
                temp[j] = (temp[j] + temp[j+1]) % 10;
            }
        }
        
        return temp[0];
    }
}