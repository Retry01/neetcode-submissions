class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums) set.add(a);
        int max = 0;
        for(int a : set){
            int i=1;
            if(set.contains(a-1)) continue;
            while(true){
                if(set.contains(a+i))
                    i++;
                else{
                    if(max<i) max = i;
                    break;
                }
            }
        }
        return max;
    }
}
