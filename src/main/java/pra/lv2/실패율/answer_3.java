package pra.lv2.실패율;

import java.util.HashMap;

public class answer_3 {

    public static void main(String[] args) {

        int n =5; //스테이지 수
        int [] arr ={2, 1, 2, 6, 2, 4, 3, 3};
        // 스테이지에 도달한 인원이네
        arr  = solution(n,arr);

        for(int a : arr){
            System.out.print(a + " ");
        }

    }
    public static int[] solution(int n, int[] stages) {
        //마지막 까지 클리어한 사용자 존재
        int [] usersCount = new int [n+2];
        //index = stage 단계
        // index[] = stage별 인원

        for(int i=0;i<stages.length;i++){
            //userCount[1] ++ ->index 1의 값이 1 증가한다
            usersCount[stages[i]]++;
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        //stage의 길이가 도전자 수이다.

        //각 스테이지를 순회하면서 실패율을 계산한다.
        for(int i=1;i<=n;i++){
            if(usersCount[i]==0){//도전한 사람이 없는 경우
                fails.put(i,0.);
            }
            else{
                //1 ..n 첫번째 스테이지부터 반복문이 시작된다.
                //stageCount의 도달은 했지만 아직 클리어하지 못한 사용자의 비율을 구한다.
                //1번째는 다 도달을했을거고, 남아있는 애를 나누어주면 실패율임
                //스테이지에 도달한 플레이어수 = n + n+1
                fails.put(i,usersCount[i]/total);
                total -=usersCount[i];

            }
        }

        for(int i=0;i<fails.size();i++){


        }

        return usersCount;


    }

}
