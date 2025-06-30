import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        String [] num = String.valueOf(n).split("");
        Arrays.sort(num);
        
        StringBuilder answer = new StringBuilder();
        for(String data : num){
            answer.append(data);
        }
        
        return Long.parseLong(answer.reverse().toString());
        
    }
}