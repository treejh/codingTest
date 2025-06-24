import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] compare =  Arrays.copyOf(array, array.length);;
        Arrays.sort(compare);
        int max = compare[compare.length-1];
        int index = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i] == max){
                index = i;
            }
        }
        
        
        return new int [] {max,
                         index};
    }
}