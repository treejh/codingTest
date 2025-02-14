package pra.lv2.올바른괄호;

import java.util.Stack;

public class answer_1 {

    public static void main(String[] args) {
        boolean result = solution(")()(");
        System.out.println(result);
    }

    static boolean solution(String s) {
        //큐와 스택을 사용하는 문제
        //문자열은 '('로 시작해야 한다.
        //')'로 시작된다면 그것은 틀린 문장
        //stack을 사용하여 '('인경우를 stack에 집어 넣고,
        //(에 맞는 짝 ')'를 만날 경우 스택에서 하나씩 지운다.
        //만약 스택이 비어져 있다면 맞는 경우이다.
        Stack<Character> arr = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                arr.push(s.charAt(i));
            }else{
                if(arr.empty()){
                    return false;
                }
                arr.pop();
            }
        }
        return arr.isEmpty();
    }



}
