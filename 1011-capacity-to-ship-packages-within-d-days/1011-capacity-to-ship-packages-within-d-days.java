class Solution {
    int func(int cap,int[] weights){
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                day++;
                load=weights[i];

            }else{
                load+=weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=0;
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int ndays=func(mid,weights);
            if(ndays<=days){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}