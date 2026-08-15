class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // ek valid combination mila
            return;
        }
        if (target < 0) return; // invalid path

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]); // choose element
            backtrack(arr, target - arr[i], i, current, result); // same element allowed again
            current.remove(current.size() - 1); // undo choice (backtrack)
        }
    }
}

        
    