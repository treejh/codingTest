import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> data = new HashSet<>();
        
        for(int i=0;i<s1.length;i++){
            data.add(s1[i]);
        }
        
        for(int i=0;i<s2.length;i++){
            if(data.contains(s2[i])){
                answer++;
            }
        }
        
        
        return answer;
    }
}