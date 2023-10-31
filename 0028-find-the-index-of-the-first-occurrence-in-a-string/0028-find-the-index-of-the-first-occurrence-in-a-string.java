class Solution {
    public int strStr(String s, String t) {
        int m=s.length();
        int n=t.length();
        for(int i=0;i<=m-n;i++){
            for(int j=0;j<n;j++){
                if(s.charAt(i+j)!=t.charAt(j)){
                    break;
                }
                if(j==n-1){
                    return i;
                }
            }
}
        return -1;
        
    }
}