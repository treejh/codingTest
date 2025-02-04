package pra.lv0.배열정렬하기;

import java.util.Arrays;

public class SortArray {

    public static int[] solution(int [] arr){
       Arrays.sort(arr);
       return arr;


    }

    public static void main(String[] args) {
        int [] arr = {1, -5, 2, 4, 3 };

        arr = solution(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");

        System.out.println(Arrays.toString(arr));


    }
}
