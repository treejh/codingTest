import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String data = String.valueOf(n);
        
        for(int i=0;i<data.length();i++){
            answer+=data.charAt(i)-'0';
        }


        return answer;
    }
}