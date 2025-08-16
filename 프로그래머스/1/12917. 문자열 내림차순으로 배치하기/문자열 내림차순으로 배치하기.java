import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char [] data = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        Arrays.sort(data);
        
        for(int i=0;i<s.length();i++){
            answer.append(data[i]);
        }
        
        return answer.reverse().toString();
    }
}