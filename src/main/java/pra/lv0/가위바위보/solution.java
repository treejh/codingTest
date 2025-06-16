package pra.lv0.가위바위보;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        Map<Character, String> winner = new HashMap<>();


        //이기는 조건만 저장
        winner.put('2',"0");
        winner.put('0',"5");
        winner.put('5',"2");

        for(int i=0;i<rsp.length();i++){
            answer.append(winner.get(rsp.charAt(i)));
        }

        return answer.toString();
    }
}
