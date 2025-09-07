import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> pri = new ArrayList<>();
        int [] answer = new int [score.length];
        
        for(int i=0;i<score.length;i++){
            if(i<=k-1){
                pri.add(score[i]);
                Collections.sort(pri); //오름차순 123
                answer[i] = pri.get(0);
                continue;
            }
           
            if (pri.get(0) < score[i]){
                pri.remove(0);
                pri.add(score[i]);
                Collections.sort(pri);
                answer[i] = pri.get(0);
            }else{
                answer[i] = pri.get(0);
            }
            
        }
        

        return answer;
    }
}