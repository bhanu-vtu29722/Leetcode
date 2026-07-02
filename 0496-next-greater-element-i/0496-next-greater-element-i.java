class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nge=new int[n];
        int[] s=new int[n];
        int[] ans=new int[m];
        int top=-1;
        for(int i=n-1;i>=0;i--){
            if(top==-1){
                nge[i]=-1;
            }else if(nums2[i]<s[top]){
                nge[i]=s[top];

            }else{
                while(top!=-1&&nums2[i]>=s[top]){
                    top--;
                    }
                    if(top==-1){
                        nge[i]=-1;
                    }else{
                        nge[i]=s[top];
                    }
                    
            }
            s[++top]=nums2[i];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=nge[j];
                break;
                }
            }

        }
        return ans;
        
    }
}