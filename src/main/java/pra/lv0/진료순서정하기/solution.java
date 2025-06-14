package pra.lv0.진료순서정하기;

public class solution {

    public static void main(String[] args) {
        solution(new int [] {3,80,25});
    }
    public static int[] solution(int[] emergency) {
        int [] result = new int [emergency.length];

        for(int i=0;i<emergency.length;i++){
            int max =0;
            int index=0;
            for(int j=0;j<emergency.length;j++){
                if(max < emergency[j]){
                    max = emergency[j];
                    index = j;
                }
            }
            emergency[index]=0;
            result[index] = i+1;
        }

        return result;
    }
}
