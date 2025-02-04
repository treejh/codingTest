package pra.lv2.n2배열자르기;

import java.util.Arrays;
import java.util.Scanner;

public class answer_1 {
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


    public int[] solution(int n, long left, long right){
        int [][] arr = new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                arr[i][j] = i;
                arr[j][i] = i;
            }
        }

        return Arrays.stream(splitArr(arr,n*n)).skip(left).limit(right-left+1).toArray();
        //return Arrays.copyOfRange(splitArr(arr,n*n),(int)left,(int)right);
    }

    public int[] splitArr(int [][] arr, int arrCount){
        int [] result = new int [arrCount];

        int index = 0;

        for(int i=1;i<=arr.length-1;i++){
            int [] copyArr = arr[i];
            System.arraycopy(copyArr,1,result,index,copyArr.length-1);
            index += copyArr.length-1;

        }




        return result;

    }







    //2차원 배열에 값을 집어 넣는 방법
    //1. for문 두번 반복 ?
    //for i=1일때, j는 0~i까지만 반복-> 행 1, 열 1
    //for i =2 일때, j = -> 행2, 열 1, 2, 3 , 열 2 일때 , 행 1, 2, 3
    //1,2,3 값을 넣어주는 기능을 하나 만들어야 할 듯 함
}
