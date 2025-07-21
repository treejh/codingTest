import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1){
            return new int[] {-1};
        }else{
            return Arrays.stream(arr)
                .filter(
            x-> x!=Arrays.stream(arr).min().getAsInt()).toArray();
        }
        
    }
}