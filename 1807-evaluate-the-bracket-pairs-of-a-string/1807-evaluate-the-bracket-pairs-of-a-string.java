class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder st = new StringBuilder();
        HashMap<String, String> mp = new HashMap<>();

        for (List<String> pair : knowledge) {
            mp.put(pair.get(0), pair.get(1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                i++;
                int left = i;
                while (s.charAt(i) != ')') {
                    i++;
                }
                String key = s.substring(left, i);

                if (mp.containsKey(key)) {
                    st.append(mp.get(key));
                } else {
                    st.append('?');
                }
            } else {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}
