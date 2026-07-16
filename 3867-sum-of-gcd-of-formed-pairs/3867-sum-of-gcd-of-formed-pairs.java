class Solution {
    int gcd(int a,int b){
        while(a>0&&b>0){
            if(a<b){
               b=b%a;
            }else{
                a=a%b;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] pre=new int[nums.length];
        int n=nums.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(nums[i],maxi);
            pre[i]=gcd(nums[i],maxi);
        }
        Arrays.sort(pre);
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum+=gcd(pre[i],pre[n-i-1]);
        }
        return sum;
        
    }
}