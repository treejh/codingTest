package pra.lv2.n2배열자르기;

import java.util.Arrays;
import java.util.Scanner;

public class answer_2 {

    public static void main(String[] args) {
        //n, left, right를 입력으로 받는다.
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String [] stringInput = input.split(" ");
        int n = Integer.parseInt(stringInput[0]);
        long left = Integer.parseInt(stringInput[1]);
        long right = Integer.parseInt(stringInput[2]);

        answer_1 answer1 = new answer_1();
        int [] arr = answer1.solution(n,left,right);

        System.out.println(Arrays.toString(arr));
    }


}
