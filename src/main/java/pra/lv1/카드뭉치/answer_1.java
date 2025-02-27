package pra.lv1.카드뭉치;

import java.util.LinkedList;
import java.util.Queue;

public class answer_1 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> firstCards = new LinkedList<>();
        Queue<String> SecondCards = new LinkedList<>();
        Queue<String> golCards = new LinkedList<>();

        for(int i=0;i<cards1.length;i++){
            firstCards.add(cards1[i]);
        }
        for(int i=0;i<cards2.length;i++){
            SecondCards.add(cards2[i]);
        }
        for(int i=0;i<goal.length;i++){
            golCards.add(goal[i]);
        }

        while(!golCards.isEmpty()){
            String firstCard = firstCards.peek();
            String SecondCard = SecondCards.peek();

            if(golCards.peek().equals(firstCard)){
                firstCards.poll();
                golCards.poll();
            }else if(golCards.peek().equals(SecondCard)){
                SecondCards.poll();
                golCards.poll();
            }else{
                answer="No";
                break;
            }

        }

        return answer;
    }
}
