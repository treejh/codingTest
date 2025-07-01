import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> numbersData = new HashSet<>();
        for(int i=0;i<=9;i++){
            numbersData.add(i);
        }
        
        for(int data : numbers){
            numbersData.remove(data);
        }
        
        return numbersData.stream().mapToInt(Integer::intValue).sum();
    }
}