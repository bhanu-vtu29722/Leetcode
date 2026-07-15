class Solution {
    int gcd(int a,int b){
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
       
        int sum1=1;
        int maxsum=0;
        for(int i=1;i<=n;i++){
            sum1=sum1+2;
            maxsum+=sum1;
        }
        
        int sum2=0;
        int maxsum2=0;
        for(int i=1;i<=n;i++){
            sum2=sum2+2;
            maxsum2+=sum2;
        }
        return gcd(maxsum,maxsum2);
    }
}