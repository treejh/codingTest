package pra.lv0.입문;

import java.util.Arrays;
public class 배열두배만들기 {

    public static int[] solution(int [] data){
        return Arrays.stream(data).map(
                i->  i*2
        ).toArray();
    }

    public int[] solution2(int[] numbers) {

        for(int i=0;i<numbers.length;i++){
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
