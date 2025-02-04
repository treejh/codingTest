package pra.lv1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class answer_1 {


    public static void main(String[] args) {
        int [] arr  = {3,2,6};
         arr = solution(arr,10);

       for(int i=0;i<arr.length;i++) {
           System.out.print(arr[i] + " ");
       }

    }



    public static int[] solution(int[] arr, int divisor) {

        int [] result = Arrays.stream(arr).filter(i->i%divisor==0).sorted().toArray();

        return result.length== 0 ?new int[]{-1} : result;


    }
}
