package 프로그래머스.lv0.배열뒤집기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class answer_3 {
    public static void main(String[] args) {
    }

    public int[] solution3(int [] arr){
        return IntStream.range(0,arr.length)
                .map(i->arr[arr.length-1-i]).toArray();
    }

}
