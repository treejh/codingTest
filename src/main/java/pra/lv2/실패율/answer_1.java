package pra.lv2.실패율;

import java.util.ArrayList;
import java.util.List;

public class answer_1 {
    public static void main(String[] args) {
        int n =5;
        int [] arr ={2, 1, 2, 6, 2, 4, 3, 3};
        arr  = solution(n,arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int N, int[] stages) {
        // n-> 스테이지 수
        // stages -> 스테이지 별 사용자
        int userCount = 0;

        //실패율 계산을 위해, stage의 개수 계산
        int stageCount = stages.length;
        List<Double> failRateArr = new ArrayList<>();
        int []  resultArr = new int [stageCount];

        for(int i=0;i<resultArr.length;i++){
            resultArr[i] = i+1;
        }

        //유저 인원을 계산하기 위해, stage당 인원 구함
        for(int i=0;i<stageCount;i++){
            userCount +=stages[i];
        }


        // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        //    - 스테이지 N에있는 유저는 아직 N을 클리어 하지못한 것이다.
        //    - 스테이지 N+1에 있는 유저는 N을 클리어한 후 N+1에 도달한 것이다.
        for(int i=0;i<stageCount;i++){
            failRateArr.add(calculateFailRate(i,stages));
        }



        //내림차순으로 정렬한다.
        //Collections.sort(failRateArr,(x,y)-> x-y);

        //만약 실패율이 같은스테이지가 있다면, 작은 번호의 스테이지가 먼저 오게 한다.
        //각 스테이지별 실패율은 다 구함
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열 return
        /// max 값을 구한후에 그 값의 인덱스를 첫번째에 넣어준다.


        for(int i=0;i<failRateArr.size();i++) {
            //최대값을 구함
            for(int j = i+1;j<failRateArr.size();j++) {
                int x = resultArr[i];
                int y = resultArr[i+1];
                //실패율이 같을때 앞에있는 인덱스 x가, y보다 큰 수라면
                if(failRateArr.get(i)==failRateArr.get(i+1)){
                    if(x>y){ //y, x 값중에
                        resultArr[i] =y;
                        resultArr[i+1] =x;
                    }
                }//실패율이 더 크다면 위치 바꿔줌
                else if(failRateArr.get(i)>failRateArr.get(i+1)){
                    resultArr[i] =y;
                    resultArr[i+1] =x;
                }

            }


        }

        return resultArr;
        // 실패율이 같은 스테이지가 있다면, 작은 번호의 스테이지가 먼저 오도록

        //- 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0이다.


    }


    public static double calculateFailRate(int locate, int [] arr){
        //스테이지당 유저 인원 필요
        // 스테이지에 도달한 플레이어 수는 스테이지 N을 기준으로 N+1 ..N은 통과한 사람들일거임
        //N뒤에 있는 유저 인원 필요
        if(locate==arr.length-1 || arr[locate]==0){
            return 0; //만약 스테이지에 도달한 인원수가 0이라면, 0을 return 해준다.
        }

        return (double)arr[locate] / calculateSuccessUser(locate,arr);



    }


    //locate로 현재 스테이지를 말해주고
    //locate 뒤에있는 인원수를 return해준다.
    //locate(N) 뒤에 있는 인원수를 return 해준다.
    public static int calculateSuccessUser(int locate,int[] arr){
        int result = 0;

        for(int i=locate+1;i<arr.length;i++){
            result+=arr[i];
        }

        return result;

    }
}
