import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] solution(int n) {
        Set<Integer> result = new HashSet<>();
        int input = n;
        
        for(int i=2;i<=Math.sqrt(input);i++){
            while(input%i==0){
                result.add(i);
                input/=i;
            }
        }
        
        if(input>1){
             result.add(input);
        }
            
        
        
        return result.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}