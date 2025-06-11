package pra.lv0.입문;

import java.util.ArrayList;

public class 짝수는싫어요 {

    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%3==0){
                list.add(i);
            }
        }

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}
