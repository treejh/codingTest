package pra.lv1.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class answer_1 {
    public static void main(String[] args) {

        int [] answer = {1, 2, 3, 4, 5};
        answer = solution(answer);

        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i] +" ");
        }

    }

    public static int[] solution(int [] answer){
        int [] person0 = {1, 2, 3, 4, 5};
        int [] person1 ={2, 1, 2, 3, 2, 4, 2, 5};
        int [] person2 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int [] result ={0,0,0};

        for(int i=0;i<answer.length;i++){
            if(person0[i%person0.length]==answer[i]){
                result[0]++;
            }
        }
        for(int i=0;i<answer.length;i++){
            if(person1[i/person1.length]==answer[i]){
                result[1]++;
            }
        }
        for(int i=0;i<answer.length;i++){
            if(person2[i/person2.length]==answer[i]){
                result[2]++;
            }
        }

        int maxValue = Arrays.stream(result).max().getAsInt();
        List<Integer> WinnerArr = new ArrayList<>();
        for(int i=0;i< result.length;i++){
            if(result[i]==maxValue){
                WinnerArr.add(i+1);
            }
        }


        return WinnerArr.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
