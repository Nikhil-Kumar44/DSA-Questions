class Solution {
    public long minimumSteps(String s) {
        int index=0;
        long ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans+=i-index;
                index++;
            }
        }
        return ans;
    }
}