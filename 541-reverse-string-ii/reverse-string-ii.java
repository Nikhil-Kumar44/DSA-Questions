class Solution {
    public String reverseStr(String s, int k) {
        char [] char_s = s.toCharArray();
         for(int i=0;i<char_s.length;i=i+2*k){
        if(char_s.length-i<k)
        reverse(i,char_s.length-1,char_s);
        else if((char_s.length-i<2*k)&&(char_s.length-i>k))
        reverse(i,i+k-1,char_s);
        else{
         reverse(i,i+k-1,char_s); 
        }
       }
       return String.valueOf(char_s); 
    }
      public void reverse(int start,int end,char [] char_s){
        while(start<end){
            char temp= char_s[start];
            char_s[start]= char_s[end];
            char_s[end]= temp;
            start++;
            end--;
        }
    }
}