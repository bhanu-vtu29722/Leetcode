class Solution {
    int find_max(int[][] mat,int col){
        int ele=-1;
        int ind=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>ele){
                ele=mat[i][col];
                ind=i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=find_max(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid<m-1?mat[row][mid+1]:-1;
            if(mat[row][mid]>left&&mat[row][mid]>right){
                return new int[]{row,mid};
            }else if(mat[row][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}