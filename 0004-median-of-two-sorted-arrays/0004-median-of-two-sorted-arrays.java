class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums1.length+nums2.length;
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);

        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        list.sort(null);
        if(n%2==1){
            return list.get(n/2);
        }
        else{
           return (list.get(n/2)+list.get(n/2-1))/2.0;}

        
    }
}