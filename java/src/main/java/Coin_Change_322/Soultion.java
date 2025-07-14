package java.coin_change_322;

class Solution {

    // coins = 1, 2, 5
    // amount = 11

    //                         -5         -2  -1   v
    // 0   1   2   3   4   5   6   7   8   9   10  11
    // 0   1   1   2   2   1   2   2   3   3   2   3
    //     

        public int coinChange(int[] coins, int amount) {
        // Initiate an array to track answers for each amount
        int[] ans = new int[amount + 1];
        int max = amount + 1;
        ans[0] = 0;

        for (int i = 1; i < ans.length; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    // What was previous step if we used coin X?
                    int previousSteps = ans[i - coin];
                    // +1 to account for extra step to get here.
                    int currentSteps = previousSteps + 1;
                    ans[i] = Math.min(ans[i], currentSteps);
                }
            }
        }

        return ans[amount] == max ? -1 : ans[amount];
        }
}

package java.coin_change_322;

class Solution {

    // coins = 1, 2, 5
    // amount = 11

    //                         -5         -2  -1   v
    // 0   1   2   3   4   5   6   7   8   9   10  11
    // 0   1   1   2   2   1   2   2   3   3   2   3
    //     

        public int coinChange(int[] coins, int amount) {
        // Initiate an array to track answers for each amount
        int[] ans = new int[amount + 1];
        int max = amount + 1;
        ans[0] = 0;

        for (int i = 1; i < ans.length(); i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    // What was previous step if we used coin X?
                    int previousSteps = ans[i - coin];
                    // +1 to account for extra step to get here.
                    int currentSteps = previousSteps + 1;
                    ans[i] = Math.min(ans[i], currentSteps);
                }
            }
        }

        return ans[amount] == max ? -1 : ans[amount];
        }
}
