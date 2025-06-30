import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        char [] data = String.valueOf(n).toCharArray();
        Integer [] numData = new Integer[data.length];
        
        for(int i=0;i<data.length;i++){
            numData[i] =  Character.getNumericValue(data[i]);
        }
        
        Arrays.sort(numData,Collections.reverseOrder());
        
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<numData.length;i++){
            answer.append(String.valueOf(numData[i]));
        }
        

        return Long.parseLong(answer.toString());
    }
}