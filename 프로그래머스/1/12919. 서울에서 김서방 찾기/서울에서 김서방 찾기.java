class Solution {
    public String solution(String[] seoul) {
        String first = "김서방은 ";
        String second = "에 있다";
        int index = 0;
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                index =i;
                break;
            }
        }
        answer.append(first);
        answer.append(index);
        answer.append(second);
        
        
        return answer.toString();
    }
}