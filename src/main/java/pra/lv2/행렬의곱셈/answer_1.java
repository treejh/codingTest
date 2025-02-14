package pra.lv2.행렬의곱셈;

public class answer_1 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,4},{3,2},{4,1}};
        int [][] arr2 = {{3,3},{3,3}};

        //[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]

        int [][] arr = solution(arr1, arr2);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(" ");
        }

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1Row = arr1.length;
        int arr1Col = arr1[0].length;

        int arr2Row = arr2.length;
        int arr2Col = arr1[0].length;

        int [][] result = new int [arr1Row][arr2Col];

        int count =arr1Row * arr2Col * arr1Col;

       for(int i=0;i<arr1Col;i++){
           int resultValue=0;
           for (int j=0;j<arr2Row;j++){
               int value = arr1[i][j] * arr2[j][i];
               resultValue+=value;
           }
       }



        return result;
    }

}
