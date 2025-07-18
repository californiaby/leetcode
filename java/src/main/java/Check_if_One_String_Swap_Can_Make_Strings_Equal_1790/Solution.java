package Check_if_One_String_Swap_Can_Make_Strings_Equal_1790;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // Conditions for the swap to be possible
        // 1. Same length. Same set/frequency of chars.
        // 2. Comparing char by char, only two chars have mismatching position
        // and positions are inverse.

        if (s1.equals(s2)) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        int first = -1;
        int last = -1;

        //          v
        // aaa[b]an[k]qq
        // aaa[k]an[b]qq

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i; // First mismatching char.
                } else if (last == -1) {
                    last = i;
                    if (s1.charAt(first) != s2.charAt(last) ||
                        s2.charAt(first) != s1.charAt(last)) {
                            return false;
                        }
                } else {
                    return false;
                }
            }
        }
        
        return first != -1 && last != -1;
    }
}