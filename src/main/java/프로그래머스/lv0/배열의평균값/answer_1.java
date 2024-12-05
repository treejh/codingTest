package 프로그래머스.lv0.배열의평균값;

import java.util.Arrays;

public class answer_1 {
    public static void main(String[] args) {

    }
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).sum() /(double)numbers.length;
    }
}
