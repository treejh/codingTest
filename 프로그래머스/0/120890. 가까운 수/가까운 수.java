import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer =  Integer.MAX_VALUE;
        int result =0; 
        
        for(int i=0;i<array.length;i++){
            int compare = Math.abs(n-array[i]);
            
            if(compare < answer){
                answer = compare;
                result = array[i];
                
            }else if(compare == answer){
                if(result >= array[i]){
                    result = array[i];
                }
            }
        }
        return result;
    }
}