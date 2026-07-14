class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=s.charAt(i)) return ans;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
}