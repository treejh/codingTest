import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            String current = my_string.substring(i);
            answer[i] = current;
        }
        Arrays.sort(answer);
        return answer;
    }
}