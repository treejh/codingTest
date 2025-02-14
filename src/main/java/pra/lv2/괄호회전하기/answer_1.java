package pra.lv2.괄호회전하기;

import java.util.Stack;

public class answer_1 {
    public static void main(String[] args) {
        int result = solution("[](){}");
        System.out.println(result);
    }
    //스택에 하나씩 넣고
    //마지막 요소를 peek이나 뭐 제거해서
    //다시 stack에 넣고 비교를 하면 될 것 같다.
    //회전 x는 s의 길이이다.

    //(), [], {} 는 올바른
    public static int solution(String s) {

        boolean result = true;
        int count =0;

        for(int i=0;i<s.length();i++){
            result = true;
            Stack<Character> chatList = new Stack<>();
            for(int j=0;j<s.length();j++){
                //j가 어디서부터 시작하는지 정해주고
                //i가 회전 수를 나타내는 것이기 때문에
                //i+j %s.length를 한다면 회전 후 해당되는 위치의 값을 구할 수 있다.
                char data = s.charAt((i+j)%s.length());

                if(data==('(')||data==('[')||data==('{')){
                    chatList.push(data);
                }else{
                    if(chatList.empty()){
                        result = false;
                        break;
                    }
                    char peekData = chatList.peek();
                    if(peekData==('(')&&data==(')') ||
                    peekData==('[')&&data==(']')||
                    peekData==('{')&&data==('}')){
                        chatList.pop();
                    }
                }
            }

            if (chatList.empty()&&result ==true){
                count++;
            }

        }

        return count;
    }
}
