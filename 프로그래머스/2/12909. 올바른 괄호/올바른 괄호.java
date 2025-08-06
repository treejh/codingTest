import java.util.Stack;

class Solution {
    boolean solution(String s) {

        //() 순서대로 넣고 stack이 비어있다면, 올바른 괄호 아니면 false 
        
        Stack<Character> data = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(data.isEmpty()){
               data.push(current);
            }else{
                //비어있지 않다면 
                char charS = data.pop();
                
                //( 일때 , ) 일때 반대로 
                if(charS == ')'&& current == '('){
                    //( 인경우, ( 랑 현재 들어오려는 값이 같으면 다시 넣어줘야하고 
                    //반대면 push 안해다고 되고, ( 이 모양일때는 push 해줘야함 
                    // ) 인 경우는 걍 넘어가도 ㄱㅊ
                    data.push(charS);
                    data.push(current);
                    
                }else if(charS == current){
                    data.push(charS);
                    data.push(current);
                }
                else if(charS =='(' && current ==')'){
                    continue;
                }
            }   
        }

        return data.isEmpty() ? true : false;
    }
}