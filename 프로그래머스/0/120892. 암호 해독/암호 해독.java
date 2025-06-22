class Solution {
    public String solution(String cipher, int code) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=1;i<=cipher.length();i++){
            char data = cipher.charAt(i-1);
            
            if( i % code ==0){
                answer.append(data);
            }
        }
        return answer.toString();
    }
}