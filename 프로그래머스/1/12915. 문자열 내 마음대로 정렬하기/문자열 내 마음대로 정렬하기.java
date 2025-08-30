import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<Character, ArrayList<String>> answer = new HashMap<>();
        ArrayList<Character> sortIn = new ArrayList<>();
        ArrayList<String> answerArr = new ArrayList<>();
            
        //인덱스, 문자열 
        for(int i=0;i<strings.length;i++){
            char data = strings[i].charAt(n);
            
            ArrayList<String> list = answer.getOrDefault(data, new ArrayList<>());
            list.add(strings[i]);
            answer.put(data,list);
        }
        
        //인덱스를 정렬
        for(int i=0;i<strings.length;i++){
            if(sortIn.contains(strings[i].charAt(n))){
                continue;
            }
            sortIn.add(strings[i].charAt(n));
        }
        
        Collections.sort(sortIn);
    
        for(int i=0;i<sortIn.size();i++){
            char data = sortIn.get(i);
            ArrayList<String> tmp = answer.get(data);
            Collections.sort(tmp);
            for(int j=0;j<tmp.size();j++){
                answerArr.add(tmp.get(j));
            }
        }
        
        
        
        return answerArr.toArray(new String[0]);
    }
}