class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       boolean[] covered=new boolean[intervals.length];
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i==j)
                continue;
                if(intervals[j][0]<=intervals[i][0]&&intervals[i][1]<=intervals[j][1]){
                    

                  covered[i]=true;
                  break;
                }
            }
        }
       int count=0;
       for(boolean x:covered){
        if(!x){
            count++;
        }
       }
       return count;
        
    }
}