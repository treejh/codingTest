package pra.lv1.완주하지못한선수;

import java.util.HashMap;

public class answer_2 {

    public static void main(String[] args) {

    }

    public static String solution(String [] participant, String [] completion){
        HashMap<String, Integer> data = new HashMap<>();
        String answer="";

        for(String name : participant){
            data.put(name,data.getOrDefault(name,0)+1);
        }

        for(String result : completion){
            if(data.containsKey(result)){
                data.put(result,data.get(result)-1);
            }
        }

        for(String result : data.keySet()){
            if(data.get(result)>0){
                answer=result;
            }
        }

        return answer;
    }
}
