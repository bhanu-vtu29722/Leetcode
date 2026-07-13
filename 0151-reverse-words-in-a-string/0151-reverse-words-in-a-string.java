class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
       int  i=s.length()-1;
        while(i>=0){
            while(i>=0&&s.charAt(i)==' '){
                i--;
            }int j=i;
            if(i<0){
                break;
            }
            while(i>=0&&s.charAt(i)!=' '){
                i--;
            }
            if(sb.length()!=0){
                sb.append(" ");
            }
                for(int k=i+1;k<=j;k++){
                    sb.append(s.charAt(k));
                }
            
        }
        return sb.toString();

        
    }
}