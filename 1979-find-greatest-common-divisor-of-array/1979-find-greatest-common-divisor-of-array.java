class Solution {
    int gcd(int a,int b){
        while(a>0&&b>0){
            if(a<b){
                b=b%a;
            }else{
                a=a%b;
            }
        }
        if(a==0)
        {
            return b;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int a=Arrays.stream(nums).min().getAsInt();
        int b=Arrays.stream(nums).max().getAsInt();
        return gcd(a,b);
    }
}