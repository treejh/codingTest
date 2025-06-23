import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character,Integer> dataList = new HashMap<>();
        ArrayList<Character> resultList = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            dataList.put(c, dataList.getOrDefault(c, 0) + 1);
        }
        
        
        for(char data : dataList.keySet()){
            if(dataList.get(data) == 1){
                resultList.add(data);
            }
        }
        
        Collections.sort(resultList); 
        
        for(int i=0;i<resultList.size();i++){
        answer += String.valueOf(resultList.get(i));

        }
        
        return answer;
    }
}