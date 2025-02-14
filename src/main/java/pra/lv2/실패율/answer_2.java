package pra.lv2.실패율;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class answer_2 {
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
        int[] answer = {};



        //스테이지는 n+1까지 있기 때문에 아래와 같이 했다.
        int [] stageUsers = new int[n+2];

        List<Double> failRate = new ArrayList<>();
        int [] resultArr= new int [n];

        //결과 값 채우기
        for(int i=0;i<resultArr.length;i++){
            resultArr[i] = i+1;
        }

        //스테이지 당 유저 숫자를 계산한다.
        for(int i=0;i<stages.length;i++){
            int value = stages[i];
            stageUsers[value]++;

        }
        //실패율 계산
        for(int i=0;i<stageUsers.length;i++){
            double userCount = (double)stageUsers[i] / calSuccessUser(i+1,stageUsers);
            failRate.add(userCount);
        }

        for(int i=0;i<n;i++){ //n+1이 포함되지 않도록
            for(int j=i+1;j<n;j++){
                if(j==n+1){
                    continue;
                }
                //실패율이 같을때 앞에있는 인덱스 x가, y보다 큰 수라면


                if(Objects.equals(failRate.get(i), failRate.get(j))){
                    int x = resultArr[i];
                    int y = resultArr[j];
                    if(x>y){ //y, x 값중에
                        resultArr[i] =y;
                        resultArr[j] =x;
                    }
                }//실패율이 더 크다면 위치 바꿔줌
                if(failRate.get(i)>failRate.get(j)){
                    int x = resultArr[i];
                    int y = resultArr[j];
                    resultArr[i] =y;
                    resultArr[j] =x;
                }
            }
        }

        //- 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        //    - 스테이지 N에있는 유저는 아직 N을 클리어 하지못한 것이다.
        //    - 스테이지 N+1에 있는 유저는 N을 클리어한 후 N+1에 도달한 것이다.
        //- 실패율이 같은 스테이지가 있다면, 작은 번호의 스테이지가 먼저 오도록
        //- 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0이다.
        //- 유저 인원을 구하려면, 스테이지에 도달한 스테이지 수 stages를 통해 구해야 한다.
        //stages는 n+1까지 존재함
        //n+1은 모든 스테이지를 통과했다는 말임




        return resultArr;
    }

    public static double calSuccessUser(int n ,int []arr){
        int result =0;
        for(int i=n;i<arr.length;i++){
            result +=arr[n];
        }

        return result;
    }


}
