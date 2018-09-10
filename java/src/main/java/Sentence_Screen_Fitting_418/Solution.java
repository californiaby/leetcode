package Sentence_Screen_Fitting_418;

public class Solution {
  public int wordsTyping(String[] sentence, int rows, int cols) {
    int[] nextIndex = new int[sentence.length];
    int[] times = new int[sentence.length];

    // Iterate through array of words. For each word check what would be the next and if times increases
    // if row starts with the word
    for (int i = 0; i < sentence.length; i++) {
      int currentLen = 0;
      int current = i;
      int time = 0;

      // Keep growing until reach end of the string
      while (currentLen + sentence[current].length() <= cols) {
        currentLen = currentLen + sentence[current].length() + 1;
        current++;

        // If reached end of the array, increase time++
        if (current == sentence.length) {
          current = 0;
          time++;
        }
      }

      // Save value. nextIndex shows what would be the index of next row's 1st word if current begins with this word
      nextIndex[i] = current;
      // times shows if the counter will be increased
      times[i] = time;
    }

    int ans = 0;
    int cur = 0;

    // Now iterate through rows and for each get the next word's index and value if times needs increment
    for (int i = 0; i < rows; i++) {
      ans = ans + times[cur];
      cur = nextIndex[cur];
    }

    return ans;
  }
}
