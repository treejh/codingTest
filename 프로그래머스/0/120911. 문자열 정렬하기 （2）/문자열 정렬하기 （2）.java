import java.util.Arrays;

class Solution {
    public String solution(String my_string) {

        String lowerData = my_string.toLowerCase();
        char [] reverseData = lowerData.toCharArray();
        
        StringBuilder answer = new StringBuilder();
        
        Arrays.sort(reverseData);
        
        for(char data : reverseData){
            answer.append(data);
        }
        
        
        return answer.toString();
    }
}