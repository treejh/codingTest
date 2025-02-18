package pra.lv0.컨트롤제트;

public class answer_1 {
    public static void main(String[] args) {
        String s = "10 20 30 40";


        System.out.println(solution(s));
    }


    public static int solution(String s) {
        int answer = 0;
        //문자열을 차례로 더한다.
        //
        //Z가 나오면 전에 더했던 숫자를 뺀다 .
        // - 최종 값을 return

        String [] list = s.split(" ");

        for(int i=0;i< list.length;i++){
            if(list[i].equals("Z")){
                answer = answer -(Integer.parseInt(list[i-1]));
                continue;
            }
            answer = answer + Integer.parseInt(list[i]);

        }
        return answer;
    }
}
