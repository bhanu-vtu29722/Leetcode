class Solution {
    boolean findsub(int[] nums,int mid,int k){
       int n=nums.length;
       int sum=0;
       int s1=1;
       for(int i=0;i<n;i++){
        if(nums[i]>mid){
            return false;
        }
        if(sum+nums[i]>mid){
            s1++;
            sum=nums[i];
        }else{
            sum+=nums[i];
        }
        if(s1>k){
            return false;
        }
       }
       return true;
    }
    public int splitArray(int[] nums, int k) {
        int low=Arrays.stream(nums).min().getAsInt();
        int high=0;

        for(int i=0;i<nums.length;i++)
        {
           high+=nums[i];
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
           if(findsub(nums,mid,k)==true){
            high=mid-1;
            ans=mid;
           }else{
            low=mid+1;
           }
        }
        return ans;
    }
}