class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int count=0;
        for(int arr:nums){
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }

        int[] result = new int[2];
        int idx = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                result[idx++] = entry.getKey();
            }
        }

        return result;
    }
        
    }
