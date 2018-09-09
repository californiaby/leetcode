package Bulls_and_Cows_299;

public class Solution {
  public String getHint(String secret, String guess) {

    int bulls = 0;
    int cows = 0;
    int[] secretDigits = new int[10];
    int[] guessDigits = new int[10];

    for (int i = 0; i < secret.length(); i++) {
      if (secret.charAt(i) == guess.charAt(i)) {
        bulls++;
      } else {
        secretDigits[secret.charAt(i)-'0']++;
        guessDigits[guess.charAt(i)-'0']++;
      }
    }

    for (int i = 0; i < 10; i++) {
      cows = cows + Math.min(secretDigits[i], guessDigits[i]);
    }

    return String.format("%dA%dB", bulls, cows);

  }
}
