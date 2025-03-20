package pra.lv1.두개의수로특정값만들기;

import java.util.HashSet;

public class answer_2 {
    public static void main(String[] args) {
        boolean data = solution(new int[]{2,3,5,9},6);
        System.out.println(data);
    }

    public static boolean solution(int []arr, int target){
        HashSet<Integer> data = new HashSet<>();


        for(int i=0;i<arr.length;i++){
            if(data.contains(target-arr[i])){
                return true;
            }
            data.add(arr[i]);
        }

        return false;
    }

}
