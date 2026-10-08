class Solution {
    public String removeOuterParentheses(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                cnt1++;
            } else { 
                cnt2++;
            }

            if (cnt1 > 1 && c == '(') {
                res.append(c);
            } else if (cnt2 < cnt1 && c == ')') {
                res.append(c);
            } else if (cnt1 == cnt2) {
                cnt1 = 0;
                cnt2 = 0;
            }
        }

        return res.toString();
    }
}
