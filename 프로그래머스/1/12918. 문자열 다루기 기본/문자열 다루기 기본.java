class Solution {
    public boolean solution(String s) {
        
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)) || 
               !(s.length()==4 || s.length()==6)){
                return false;
            }
        }
        
        return true;
        
    }
}