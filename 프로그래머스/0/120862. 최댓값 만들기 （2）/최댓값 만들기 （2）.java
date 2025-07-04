import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); //오름차순
        
        
       return  Math.max(numbers[0] * numbers[1]
                 ,numbers[numbers.length-1] * numbers[numbers.length-2]);

    }
}