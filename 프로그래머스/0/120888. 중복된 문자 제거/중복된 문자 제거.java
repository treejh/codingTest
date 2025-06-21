import java.util.Set;
import java.util.HashSet;
class Solution {
    public String solution(String my_string) {
        Set<Character> data = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++){
            char input = my_string.charAt(i);
            if(!data.contains(input)){
                data.add(input);
                result.append(input);
            }
        }
        
        return result.toString();
    }
}