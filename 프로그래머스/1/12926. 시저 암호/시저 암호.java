class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            Character data = s.charAt(i);
            if(Character.isLowerCase(data)){
                char ab = (char)((data - 'a' + n) % 26 + 'a');
                sb.append(ab);
            }else if(Character.isUpperCase(data)){
                 char ab = (char)((data - 'A' + n) % 26 + 'A');
                sb.append(ab);
            }else{
                char ab = ' ';
                sb.append(ab);
            }
            
        }
        return sb.toString();
    }
}