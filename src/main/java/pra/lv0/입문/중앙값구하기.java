package pra.lv0.입문;

import java.util.Arrays;

public class 중앙값구하기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,7,10,11}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);

        return array[(array.length/2)];
    }
}
