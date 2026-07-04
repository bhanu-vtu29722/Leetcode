class Solution {
    int sumx(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)Math.ceil((double)nums[i]/mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       int max=Arrays.stream(nums).max().getAsInt();
       int low=1;
       int high=max;
       int ans=0;
       while(low<=high){
        int mid=(low+high)/2;
        if(sumx(nums,mid)<=threshold){
            ans=mid;
            high=mid-1;

        }else{
            low=mid+1;
        }
       }
       return ans;

    }
}