import java.util.Map;
import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        String result  =numbers;
        String [] numberList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        Map<String, Integer> numberMapping = new HashMap<>();
        for(int i=0;i<10;i++){
            numberMapping.put(numberList[i],i);
        }
        
        for(String data : numberMapping.keySet()){
            result = result.replace(data, String.valueOf(numberMapping.get(data)));
        }
        
        return Long.valueOf(result);

    }
}