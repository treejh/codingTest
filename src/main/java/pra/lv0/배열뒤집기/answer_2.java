package pra.lv0.배열뒤집기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class answer_2 {
    public static void main(String[] args) {
    }

    public int[] solution2(int [] arr){

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //List<Integer> list = Arrays.stream(arr).boxed().toList();
        //collect(Collectors.toList()) = toList();
        //8버전, 16버전 둘이 사용은 같음
        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }



}
