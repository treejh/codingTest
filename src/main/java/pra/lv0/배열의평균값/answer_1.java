package pra.lv0.배열의평균값;

import java.util.Arrays;

public class answer_1 {
    public static void main(String[] args) {

    }
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).sum() /(double)numbers.length;
    }

    public double solution2(int [] numbers){
        int result =0;
        for(int i=0;i<numbers.length;i++){
            result+=numbers[i];
        }

        return result / (double)numbers.length;
    }
}
