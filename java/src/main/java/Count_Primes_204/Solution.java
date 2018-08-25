package Count_Primes_204;

public class Solution {
  public int countPrimes(int n) {
    // Store flags in array
    boolean[] flags = new boolean[n];
    for (int i = 2; i < flags.length; i++) flags[i] = true;

    int prime = 2;
    int sqrt = (int) Math.sqrt(n-1);

    while (prime <= sqrt) {
      // Run check only if current value hasn't been crossed out
      if (flags[prime]) {

        // Iterate through the array for each n number (n = current prime) and cross out numbers:
        // n * 1, n * 2, etc. Start with n * n as all previous numbers should already be covered by previous iterations
        for (int i = prime*prime; i < n; i = i+prime) {
          flags[i] = false;
        }
      }
      prime++;
    }

    int ans = 0;
    for (boolean flag : flags) {
      if (flag) ans++;
    }

    return ans;
  }
}
