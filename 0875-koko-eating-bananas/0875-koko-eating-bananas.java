class Solution {
    long fun(int hour,int[] piles){
        long total=0;
        for(int i=0;i<piles.length;i++){
            total+=(long)Math.ceil((double)piles[i]/hour) ;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
       
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(low<=high){
           int mid=low+(high-low)/2;
           long total= fun(mid,piles);
            if(total<=h){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return low;
    }
}