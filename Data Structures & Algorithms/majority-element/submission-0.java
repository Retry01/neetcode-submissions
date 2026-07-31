class Solution {
    public int majorityElement(int[] nums) {
        int ele=-1;
        int cnt = 0;
        for(int a : nums){
            if(cnt==0){
                cnt++;
                ele = a;
            }
            else if(ele==a) cnt++;
            else cnt--;
        }
        return ele;
        /*
        4 
        a a b
        a b a
        b a a
        5 5 1 1 1 5 5
        res=5  cnt=0 
        a a b c 
        a a c b 
        a b a c 
        a b c a 
        a c a b 
        a c b a 
        b a a c
        b a c a 
        b c a a
        c a a b 
        c a b a 
        c b a a
        */
    }
}