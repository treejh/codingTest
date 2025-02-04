package pra.lv0.배열뒤집기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class answer_1 {
    public static void main(String[] args) {
    }

    public int[] solution(int[] numbers) {
        int[] newNumb = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            newNumb[i] = numbers[numbers.length - 1 - i];
        }

        return newNumb;
    }

    public int[] solution2(int[] numbers){

        int [] arr = new int [numbers.length];
        for(int i=0;i<numbers.length;i++){
            arr[i] = numbers[numbers.length-i-1];
        }

        return arr;
    }

    public int [] solution3(int [] numbers){
       List<Integer> arr = Arrays.stream(numbers).boxed().collect(Collectors.toList());
       Collections.reverse(arr);
       return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution4(int[] numbers) {

        return IntStream.range(0,numbers.length)
                .map(i -> numbers[numbers.length-1-i]).toArray();
    }

}


