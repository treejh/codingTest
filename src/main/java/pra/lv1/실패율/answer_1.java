package pra.lv1.실패율;

import java.util.HashMap;
import java.util.Map;

public class answer_1 {

    public static int[] solution(int StageNumber, int[] stages) {
        int  [] countStage = new int[StageNumber+2];
        // +2가 되는 과정
        // +1 하는 이유 : stage 는 1부터 시작하기 때문에 +1을 해야 한다.
        // +1 하는 이유 : 최종 스테이지 클리어 한 사람은  다음 단계의 번호를 가지고 있기 때문에 +1을 해야 한다.
        //그래서 배열의 크기를 +2를 하게 되었다.

        double user =stages.length;
        //확률로 계산하기 위해서 double형으로 선언했다.


        for(int i=0;i<stages.length;i++) {
            countStage[stages[i]]+=1;
            //stages[] 인원을 countStage의 인덱스로 매칭해주었다.
            //이것을 통해 스테이지 별 인원수를 알 수 있다.
        }

        HashMap<Integer, Double> failCount = new HashMap<>();
        //스테이지별 실패율을 확인하기 위해서 HashMap으로 선언했다.

        for(int i=1;i<StageNumber+1;i++){
            if(countStage[i]==0){
                //스테이지에 도전자가 없다면, 해당 스테이지를 건너간 것이기 때문에 실패율은 0으로 설정한다.
                failCount.put(i,0.0);
            }
            failCount.put(i,countStage[i]/user);
            //스테이지별 실패율을 HashMap에 저장해준다.
            user-=countStage[i];
            //스테이지에 남아있는 인원들은 총 인원에서 제외해준다.
        }

        return failCount.entrySet().stream().sorted(((o1, o2)
                -> Double.compare(o2.getValue(),o1.getValue()))).mapToInt(Map.Entry::getKey).toArray();


    }


}

