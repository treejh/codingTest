class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            char data = my_string.charAt(i);
            if(Character.isDigit(data)){
                answer+=data-'0';
            }
        
        }
        return answer;
    }
}