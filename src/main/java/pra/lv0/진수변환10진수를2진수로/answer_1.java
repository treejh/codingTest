package pra.lv0.진수변환10진수를2진수로;

import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class answer_1 {

    public static void main(String[] args) {
      int []  result = solution(27);

      for(int data : result){
          System.out.print(data + " ");
      }


    }

    public static int[] solution(int data){
        Stack<Integer> list = new Stack<>();

        while(data>0){
            list.push(data%2);
            data = data/2;
        }
        List<Integer> result = list.stream().collect(Collectors.toList());

        Collections.reverse(result);

        return result.stream().mapToInt(Integer::intValue).toArray();


    }
}
