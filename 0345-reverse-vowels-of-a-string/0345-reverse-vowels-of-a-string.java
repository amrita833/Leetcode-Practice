
        class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // left pointer vowel ढूँढेगा
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // right pointer vowel ढूँढेगा
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // swap vowels
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

        
