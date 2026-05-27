


        class Solution {
    public int numberOfSpecialChars(String word) {

        int[] small = new int[26];
        int[] capital = new int[26];

        // initialize with -1
        for (int i = 0; i < 26; i++) {
            small[i] = -1;
            capital[i] = -1;
        }

        // positions store karo
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                small[ch - 'a'] = i; // last lowercase position
            } 
            else {
                // first uppercase position
                if (capital[ch - 'A'] == -1) {
                    capital[ch - 'A'] = i;
                }
            }
        }

        int count = 0;

        // check condition
        for (int i = 0; i < 26; i++) {

            if (small[i] != -1 &&
                capital[i] != -1 &&
                small[i] < capital[i]) {

                count++;
            }
        }

        return count;
    }
}


        
