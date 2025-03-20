package pra.lv2.의상;

import java.util.HashMap;

public class answer_1 {

    public static void main(String[] args) {
        String[][] items = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        int data = solution(items);
        System.out.println(data);
    }
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> clothsList = new HashMap<>();
        int countValue=1;
        //맵을 통해서, 종류 당 몇가지의 옷이 있는지 계산
        for(int i=0;i<clothes.length;i++){
            clothsList.put(clothes[i][1], clothsList.getOrDefault(clothes[i][1],0)+1);
        }


        for(String cloths : clothsList.keySet()) {
            countValue *= (clothsList.get(cloths) + 1);

        }

        return countValue-1 ;
    }

}
