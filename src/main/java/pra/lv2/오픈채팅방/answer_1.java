package pra.lv2.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;

public class answer_1 {

    public static void main(String[] args) {
        
    }

    public static String[] solution(String[] record) {
        HashMap<String,String> resultData = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for(String data : record){
            String []lengthData = data.split(" ");
            if(!lengthData[0].equals("Leave")){
                resultData.put(lengthData[1],lengthData[2]);
            }



        }

        for(String data : record){
            String []lengthData = data.split(" ");

            if(lengthData[0].equals("Enter")){
                result.add(resultData.get(lengthData[1])+"님이 들어왔습니다.");
            }else if(lengthData[0].equals("Leave")){
                result.add(resultData.get(lengthData[1])+"님이 나갔습니다.");
            }

        }

        String [] answerData= new String [result.size()];

        for(int i=0;i<result.size();i++){
            answerData[i] = result.get(i);
        }

        return answerData;
    }
}
