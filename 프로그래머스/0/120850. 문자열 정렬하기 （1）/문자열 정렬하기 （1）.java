import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<my_string.length();i++){
            char data = my_string.charAt(i);
            if(Character.isDigit(data)){
                result.add(data-'0');
            };
        }
        return result.stream()
            .sorted()
            .mapToInt(Integer::intValue).toArray();
    }
}