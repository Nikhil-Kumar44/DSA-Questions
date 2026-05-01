class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           List<Integer>list=new ArrayList<>();
      Arrays.sort(nums1);
      Arrays.sort(nums2);
        int i=0,j=0;
        int n=nums1.length;
        int m=nums2.length;
        while(i<n&& j<m){
            if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            if(j>0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])i++;
            else j++;
        }
        int[] ans=new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
        return ans;
    }
}