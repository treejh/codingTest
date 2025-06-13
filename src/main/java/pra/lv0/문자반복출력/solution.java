package pra.lv0.문자반복출력;

public class solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            answer.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return answer.toString();
    }
}
