package pra.lv1.완주하지못한선수;

import java.util.HashMap;

public class answer_1 {
    public static void main(String[] args) {
        String  data = solution(new String [] {"mislav", "stanko", "mislav", "ana"},new String [] {"stanko", "ana", "mislav"});
        System.out.println(data);
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> data = new HashMap<>();

        for(String participantName : participant){
            if(!data.containsKey(participantName)){
                data.put(participantName, 1);
            }else{
                data.put(participantName, data.get(participantName) +1);
            }

        }

        for(int i=0;i<completion.length;i++) {
            if(data.containsKey(completion[i])){
                data.put(completion[i],(data.get(completion[i]))-1);
            }
        }


        String answer ="";
        for(String resultData : data.keySet()){
            if(data.get(resultData)>0){
                answer = resultData;
            }
        }


        return answer;
    }
}
