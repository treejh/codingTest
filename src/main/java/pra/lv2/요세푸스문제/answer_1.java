package pra.lv2.요세푸스문제;

import java.util.LinkedList;
import java.util.Queue;

public class answer_1 {

    //n명의 사람이 원 형태로 서있다.
    //각 사람은 1부터 N까지 번호표를 가지고 있다.
    //그리고 임의숫자 k가 주어진다.

    //1번 번호표를 가진 사람을 기준으로, k번째 사람을 없앤다.
    //없앤 사람을 기준으로 다시 K번째 사람을 없앤다.
    //n과 k가 주어질때 마지막에 살아있는 사람의 번호를 반환하는 함수 구현
    public static void main(String[] args) {
        System.out.println(solution(5,2));
    }


    public static int solution(int n , int k){

        Queue<Integer> peoples= new LinkedList<>();
        for(int i=1;i<=n;i++){
            peoples.add(i);
        }

        while(peoples.size()!=1){
            for(int i=0;i<k-1;i++){
                peoples.add(peoples.poll());
            }
            peoples.poll();
        }

        return peoples.peek();
       }

    }

