class Solution {
    int counter(int ans){
       int  count=0;
        while(ans!=0){
           count+=ans&1;
            ans=ans>>1;
        }
        return count;
    }
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        return counter(ans);
    }
}