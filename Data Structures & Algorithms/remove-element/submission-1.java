class Solution {
    public int removeElement(int[] nums, int val) {
        // 1 5 3 2 2 2 2
        //     i j  
        int i=0;
        int j=nums.length-1;
        int cnt=0;
        while(i<=j){
            if(nums[j]==val){
                j--;
                cnt++;
                continue;
            }
            if(nums[i]==val){
                nums[i] = nums[j];
                cnt++;
                i++;
                j--;
            }
            else i++;
        }
        return nums.length-cnt;
    }
}