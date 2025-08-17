import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int remain =budget;
        int count =0;
        
        for(int i=0;i< d.length ;i++){
            if(d[i] > remain){
                 break;
            }
            remain -= d[i];
            count++;
           
        }
        
        return count;
    }
}