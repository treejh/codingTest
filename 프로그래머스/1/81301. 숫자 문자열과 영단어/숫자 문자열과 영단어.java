import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        Map<Integer,String> dictionary = new HashMap<>();
        String input = s;
        String [] data = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for(int i=0;i<10;i++){
            dictionary.put(i,data[i]);
        }
        while(input.length()!=0){
            if(Character.isDigit(input.charAt(0))){
                answer.append(input.charAt(0));
                input = input.substring(1);
            }else{
                for(Integer iter : dictionary.keySet()){
                    String current =dictionary.get(iter);
                    if(input.startsWith(current)){
                        answer.append(iter);
                        input = input.substring(current.length());
                    }
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}