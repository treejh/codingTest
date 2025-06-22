class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        for(int i=0;i<my_string.length();i++){
            char data  = my_string.charAt(i);
            if(Character.isUpperCase(data)){
                answer.append(Character.toLowerCase(data));
            }else{
                answer.append(Character.toUpperCase(data));
            }
        }
        return answer.toString();
    }
}