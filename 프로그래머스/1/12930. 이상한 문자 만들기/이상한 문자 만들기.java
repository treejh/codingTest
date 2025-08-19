class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder ();
        
        int idx = 0; 
        
        for(int i=0;i<s.length();i++){
            char data = s.charAt(i);
            
            if(data == ' '){
                sb.append(' ');
                idx = 0;
                continue;
            }

           if(idx%2==0 || idx==0){
                //짝수면 대문자 
                data = Character.toUpperCase(data);
            }else{
                data = Character.toLowerCase(data);
            }
            
            sb.append(data);
            idx++;
        }
        return sb.toString();
    }
}