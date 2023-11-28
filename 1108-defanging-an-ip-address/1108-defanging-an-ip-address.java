class Solution {
    public String defangIPaddr(String address) {
       int n = address.length();
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<n;i++){
           if(address.charAt(i)=='.'){
               sb.append("[");
               sb.append(".");
               sb.append("]");
           }
           else{
               sb.append(address.charAt(i));
           }
       } 
       String str = sb.toString();
       return str;
    }
}