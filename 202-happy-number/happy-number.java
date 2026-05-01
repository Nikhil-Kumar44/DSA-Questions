class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=next_num(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    private int next_num(int n){
        int output=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            output+=digit*digit;
        }
        return output;
    }
}