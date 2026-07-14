class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=s.charAt(i)) return ans;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}