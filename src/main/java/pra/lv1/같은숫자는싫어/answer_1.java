package pra.lv1.같은숫자는싫어;

import java.util.Stack;

public class answer_1 {

    public static void main(String[] args) {

        int [] data = solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        for(int i=0;i<data.length;i++){
            System.out.print(data[i] + " ");
        }
    }

    public static int[] solution(int []arr) {

        Stack<Integer> list = new Stack<>();

        for(int data : arr){
           if(list.empty() ||list.peek()!=data ){
               list.push(data);
           }

        }

        int[] answer = new int [list.size()];
        int size = list.size();

        for(int i=size-1;i>=0;i--){
            answer[i]=list.pop();
        }

        return answer;
    }
}
