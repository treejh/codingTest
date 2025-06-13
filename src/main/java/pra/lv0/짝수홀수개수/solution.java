package pra.lv0.짝수홀수개수;

public class solution {

    public static void main(String[] args) {
        int [] result = solution2(new int [] {120,121});
        //0 -> 짝수
        //1 -> 홀수
        System.out.println(result[0] + ": " + result[1]);
    }

    //첫번째 코드
    public static int[] solution(int[] num_list) {
        int[] answer = new int [2];


        for(int num : num_list){
            if(num%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }

        return answer;
    }


    //두번째 코드
    public static int[] solution2(int [] num_list){

        int [] answer = new int[2];
        for(int i=0;i<num_list.length;i++){
            answer[num_list[i]%2]++;
        }
        return answer;
    }
}
