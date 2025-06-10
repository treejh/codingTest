package pra.lv2.다단계칫솔판매;

import java.util.Arrays;
import java.util.HashMap;

public class answer_1 {

    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        answer_1 solution = new answer_1();
        int[] result = solution.solution(enroll, referral, seller, amount);

        System.out.println("결과: " + Arrays.toString(result));
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        HashMap<String,String> sellerList = new HashMap<>();


        for(int i=0;i<enroll.length;i++){
            sellerList.put(enroll[i],referral[i]);
        }

        HashMap<String,Integer> resultList = new HashMap<>();

        for(int i=0;i<seller.length;i++){
            int price = amount[i] * 100;
            calculate(sellerList,resultList,seller[i],price);
        }

        int[] result = new int[enroll.length];

        for(int i=0;i<enroll.length;i++){
            result[i]= resultList.getOrDefault(enroll[i],0);
        }

        return result;
    }

    public static void calculate(HashMap<String, String> sellerList, HashMap<String, Integer> resultList, String name, int price) {

        String parent = sellerList.get(name);
        int sellerPrice = price-(price/10);

        resultList.put(name, resultList.getOrDefault(name, 0) + sellerPrice);

        if (price / 10 > 0 && !parent.equals("-")) {
            calculate(sellerList, resultList, parent, price / 10);
        }

    }



}
