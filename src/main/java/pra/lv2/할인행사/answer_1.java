package pra.lv2.할인행사;

import java.util.HashMap;

public class answer_1 {


    public static void main(String[] args) {
        System.out.println(solution(new String[] {"banana", "apple", "rice", "pork", "pot"}
        ,new int []{3, 2, 2, 2, 1},new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }


    public static int solution(String[] want, int[] number, String[] discount) {

        int count =0;
        HashMap<String, Integer> wantList = new HashMap<>();

        for(int i=0;i<want.length;i++){
            wantList.put(want[i],number[i]);
        }


        for(int i=0;i<=discount.length-10;i++){
            System.out.println(i);
            if(validData(wantList,i,i+9,discount)){
                    count++;
            }
        }
        return count;

    }

    public static boolean validData(HashMap<String, Integer> dataList, int startDate, int endDate,String[] discount){
        HashMap<String, Integer> wantList = new HashMap<>(dataList);

        for(int i=startDate;i<=endDate;i++){
            if(wantList.containsKey(discount[i])){
                wantList.put(discount[i],wantList.get(discount[i])-1);

                if(wantList.get(discount[i])<=0){
                    wantList.remove(discount[i]);
                }

            }
        }

        return wantList.isEmpty();

    }
}
