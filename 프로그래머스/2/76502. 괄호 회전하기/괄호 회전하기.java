import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0;i<s.length();i++){
            //s를 s의 길이만큼 회전시켰을때 나오는 문자열이 올바른 문자열만 return 
            Stack<Character> list = new Stack<>();
            boolean state = false;
            
            for(int j=0;j<s.length();j++){
                char current = s.charAt((i+j)%s.length());
                
                if (current == '[' || current == '(' || current == '{'){
                    list.push(current);
                } else if(list.isEmpty()){
                    state = false;
                    break;
                }
                else{
                    // ] 닫는애가 들어왔을때, 리스트에 있는애가 얘랑 세트여야함 
                    char popData = list.pop();
                    
                    if(current ==']' && popData == '['){
                        state = true;
                    }else if(current ==')' && popData == '('){
                          state = true;
                    }else if (current =='}' && popData == '{'){
                         state = true;
                    }else{
                        state = false;
                    }
                }
        }
            
            if(state && list.isEmpty()){
                answer++;
            }
            
        }
        return answer;
    }
}