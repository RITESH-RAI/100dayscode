class Solution {
    public boolean isValid(String s) {
         Stack <Character>sk=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('||ch=='{'||ch=='['){//opening
            sk.push(ch);
        }else{
            if(sk.isEmpty()){
                return false;
            }
            if((sk.peek()=='(' && ch==')')||(sk.peek()=='{'  &&ch=='}')||(sk.peek()=='['&&ch==']')){
           sk.pop();
           } else{
            return false;
           }
        }
    }
    if(sk.isEmpty()){
        return true;
    }else{
        return false;
    }
    }
}