import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int temp = 0;
        int remain =budget;
        int count =0;
        
        for(int i=0;i< d.length ;i++){
            if(d[i] > remain){
                 break;
            }
            remain -= d[i];
            count =i;
           
        }
        
        return d[0] > budget ? 0 : count+1;
    }
}