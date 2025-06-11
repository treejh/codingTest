package pra.lv0.입문;

import java.util.HashMap;
import java.util.Map;

public class 최빈값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int [] {1,2,3,3,3,4}));

    }

    public static int solution(int[] array) {
        Map<Integer, Integer> numberList = new HashMap<>();
        int result = -1;
        int maxData = -1;

        for(int data : array){
            if(numberList.containsKey(data)){
                numberList.put(data,numberList.get(data)+1);
                continue;
            }
            numberList.put(data,1);
        }

        for(Map.Entry<Integer, Integer> data : numberList.entrySet()){
            int key = data.getKey();
            int value = data.getValue();

            if(value>maxData){
                maxData = value;
                result = key;
            }else if(value == maxData){
                result  = -1;
            }
        }

        return result ;

    }
}
