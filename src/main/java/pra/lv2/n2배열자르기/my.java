package pra.lv2.n2배열자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class my {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String data = bf.readLine();
        int [] arr = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();
        // Arrays.stream((즉, String[])을 스트림(Stream<String>)으로 변환하는 것입니다.
        //Integer::parseInt → 메서드 참조 (메서드를 참조하여 전달)
        //Integer.parseInt("123") → 메서드 호출 (메서드를 실행하여 결과 반환)

        int [] result= solution(arr[0],arr[1],arr[2]);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        System.out.println(result.toString());

    }

    public static int [] solution(long n, long left, long right){
//        int [] arr = new int [(right-left)+1];
        ArrayList<Integer> arr = new ArrayList<>();
        //left의 좌표를 구해보자


        long count = (right-left)+1; //return 해야할 값 개수


        for(long i=left;i<=right;i++){

            int x = (int)(i/n)+1; //행
            int y = (int)(i%n)+1; //열
            if(x >= y){
//                arr[i] = x;
                arr.add(x);
            }else{
//                arr[i] = x+(y-x);
                arr.add(x+(y-x));
            }
        }




       return arr.stream().mapToInt(Integer::intValue).toArray();
    }


}
