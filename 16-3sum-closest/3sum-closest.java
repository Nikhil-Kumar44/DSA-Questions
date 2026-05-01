class Solution {
    public int threeSumClosest(int[] nums, int target) {
          Arrays.sort(nums);
          int ans=0;
          int mini_diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=0;
                 diff=Math.abs(sum-target);
                if(sum>target){
                   if(diff<mini_diff){
                    mini_diff=diff;
                    ans=sum;
                   }
                    k--;
                }
                else if(sum<target){
                     if(diff<mini_diff){
                    mini_diff=diff;
                    ans=sum;
                   }
                    j++;
                }
                else{
                  return sum;
                }

            }
        }
        return ans;
    }
}