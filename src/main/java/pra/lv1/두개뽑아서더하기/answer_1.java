package pra.lv1.두개뽑아서더하기;

import java.util.ArrayList;

public class answer_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        arr= solution(arr);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    }

    public static int [] solution(int [] arr){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                result.add(arr[i]+arr[j]);
            }
        }

        return result.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }


}
