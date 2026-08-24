class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        // Queue me [index, tickets] store karenge
        for (int i = 0; i < tickets.length; i++) {
            q.add(new int[]{i, tickets[i]});
        }

        int time = 0;
        while (!q.isEmpty()) {
            int[] person = q.poll(); // front person nikalo
            person[1]--;             // ek ticket kharida
            time++;                  // 1 second laga

            if (person[1] > 0) {
                q.add(person);       // tickets bache hain → end me bhejo
            }

            if (person[0] == k && person[1] == 0) {
                return time;         // target person ke tickets khatam → stop
            }
        }
        return time;
    }
}
