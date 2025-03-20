package pra.lv1.두개의수로특정값만들기;

public class answer_1 {
    public static void main(String[] args) {
        boolean data = solution(new int[]{2,3,5,9},6);
        System.out.println(data);
    }

    public static boolean solution (int [] arr , int target){
        boolean result = false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    //result =true;
                    //break;
                    return true;
                }
            }
//            if(result==true){
//                break;
//            }

        }

        return false;

    }
}
