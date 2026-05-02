class Solution {
    private String solve(int left,int right, String s){
          while(left>=0&&right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            }
            else break;
          }
          return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
          String ans="";
        for(int i=0;i<s.length();i++){
            String a=solve(i,i,s);
            String b=solve(i,i+1,s);
            if(a.length()>ans.length()){
                ans=a;
            }
            if(b.length()>ans.length()){
                ans=b;
            }
        }
    
        return ans;
    }
}