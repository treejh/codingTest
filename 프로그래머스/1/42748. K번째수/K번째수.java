import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for(int i=0;i<commands.length;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            int [] list = new int []{commands[i][0],commands[i][1],commands[i][2]};
            for(int j=list[0]-1;j<list[1];j++){
                //-1부터 자르면 될듯
                arr.add(array[j]);
            }
            
            Collections.sort(arr);
            
            answer[i] = arr.get(list[2]-1);
        }
        return answer;
    }
}