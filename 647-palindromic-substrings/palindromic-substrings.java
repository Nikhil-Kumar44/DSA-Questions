class Solution {
    int ans=0;
      private void solve(int left,int right,String s){
        
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            ans++;
        }
            
    }
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
           solve(i,i,s);
            solve(i,i+1,s);
        }
        return ans;
    }
}
