class Solution {
    boolean possible(int[] bloomday,int day,int m,int k){
        int count=0;
        int no=0;
        for(int i=0;i<bloomday.length;i++){
            if(day>=bloomday[i]){
                count++;
            }else{
                no=no+(count/k);
                count=0;
            }
        }
        no += count / k;
        if(no>=m){
            return true;
        }
        return false;
            
        

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Arrays.stream(bloomDay).min().getAsInt();

       
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int low=min;
        int high=max;
        if(bloomDay.length<(m*k)){
            return -1;
        }
       int ans=-1;
       while(low<=high){
         int mid=(low+high)/2;
         if(possible(bloomDay,mid,m,k)==true){
            ans=mid;
            high=mid-1;
         }else{
            low=mid+1;
         }
       }
       return ans;
    }
}