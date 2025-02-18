package pra.lv0.컨트롤제트;

import java.util.Stack;

public class answer_2 {

    public static void main(String[] args) {
        String s = "10 20 30 40";


        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int answer  = 0;
        Stack<Integer> list = new Stack<>();


        for(String data : s.split(" ")){
            if(data.equals("Z")){
                list.pop();
            }else{
                list.push(Integer.parseInt(data));
            }

        }

        for(int data : list){
            answer+=data;
        }

        return answer;


        }
}
