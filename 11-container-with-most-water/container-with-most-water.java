class Solution {
    public int maxArea(int[] height) {
       int ans=0;
       int i=0;
       int j=height.length-1;
       while(i<j){
        int mini=Math.min(height[i],height[j]);
        int distance=j-i;
        ans=Math.max(ans,mini*distance);
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }
       }
       return ans;
    }
}