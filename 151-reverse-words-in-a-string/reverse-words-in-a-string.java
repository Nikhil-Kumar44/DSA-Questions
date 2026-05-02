class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
          StringBuilder ans=new StringBuilder();
        int n=s.length();
        sb.reverse();
        for(int i=0;i<n;i++){
           StringBuilder word=new StringBuilder();
            while(i<n&&sb.charAt(i)!=' '){
                 word.append(sb.charAt(i));
                 i++;
                 }
            
            word.reverse();
            if(word.length()>0){
            ans.append(' ');
            ans.append(word);
        }
        }
        ans.deleteCharAt(0);
        return ans.toString();
    }
}