package pra.lv0.배열제어하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class controlArray {

    public static int[] solution( int[] arr){

        Integer [] result = Arrays.stream(arr).boxed().distinct().toArray(Integer []::new);

        //Integer [] result2 = Arrays.stream(arr).boxed().distinct().sorted(Collections.reverseOrder()).toArray(Integer []::new);

        Arrays.sort(result,Collections.reverseOrder());

        int[] arr2 = {1, 2, 2, 3};
        int[] result2 = Arrays.stream(arr)
                .distinct() // IntStream에서 중복 제거
                .toArray();  // 기본형 배열(int[]) 생성
        //기본 자료형 : int, String, double
       System.out.println(Arrays.toString(result)); // [1, 2, 3]



        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();

    }


    public static void main(String[] args) {
        int [] arr = {4, 2, 2, 1, 3, 4 };
        //배열의 중복값을 제거하고, 배열 데이터를 내림차순으로 정렬 후 반환

        HashSet hashSet = new HashSet();

        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }


        Integer [] distinctHash = (Integer[]) hashSet.toArray(new Integer[hashSet.size()]);

        arr = Arrays.stream(distinctHash).sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();


        for(int i=0;i<distinctHash.length;i++) {
            System.out.print(arr[i] + " ");
        }



}
}