package pra.lv2.짝지어제거하기;

import java.util.Stack;

public class answer_1 {
    public static void main(String[] args) {
        int result = solution("baabaa");
        System.out.println(result);

    }

    public static int solution(String s) {
        Stack<Character> list = new Stack<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char data = s.charAt(i);
            if (list.empty()) {
                list.push(data);
            } else if (list.peek() == data) {
                list.pop();
            } else {
                list.push(data);
            }

        }

        if (list.isEmpty()) {
            result = 1;
        }
        return result;


    }


    public static int solution2(String s) {

        Stack<Character> list = new Stack<>();

        for (Character data : s.toCharArray()) {
            if (list.empty()) {
                list.push(data);
            } else if (list.peek() == data) {
                list.pop();
            } else {
                list.push(data);
            }
        }

        return list.empty() ? 1 : 0;
    }
}
