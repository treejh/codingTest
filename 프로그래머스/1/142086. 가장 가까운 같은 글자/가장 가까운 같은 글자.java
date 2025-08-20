import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        
        Map<Character, Integer> lastIndex = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (lastIndex.containsKey(c)) {
                answer[i] = i - lastIndex.get(c);
            } else {
                answer[i] = -1;
            }
            
            lastIndex.put(c, i);
        }
        
        return answer;
    }
}
