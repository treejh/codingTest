import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] sides) {
        int maxValue = Math.max(sides[0], sides[1]);
        int minValue = Math.min(sides[0], sides[1]);
        
        int minus = maxValue-minValue;
        int plus = maxValue+minValue;
    
        return plus-minus-1;
    }
}