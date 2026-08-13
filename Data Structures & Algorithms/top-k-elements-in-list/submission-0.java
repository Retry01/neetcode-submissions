class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new ArrayList[nums.length + 1];
        int[] f = new int[2002];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                f[-1 * nums[i] + 1000]++;
            else
                f[nums[i]]++;
        }
        for (int i = 0; i <= nums.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (int i = 0; i < f.length; i++) {
            int a;
            if (i > 1000)
                a = (i - 1000) * -1;
            else
                a = i;
            freq[f[i]].add(a);
        }
        List<Integer> ans = new ArrayList<>();
        int ok=k;
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i].size() <= k) {
                ans.addAll(freq[i]);
                k -= freq[i].size();
            } else {
                for (int j = 0; j < k; j++) ans.add(freq[i].get(j));
                break;
            }
        }
        int[] fans = new int[ok];
        for(int i=0;i<ok;i++) fans[i]=ans.get(i);
        return fans;
    }
}