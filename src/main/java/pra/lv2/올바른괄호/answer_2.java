package pra.lv2.올바른괄호;

public class answer_2 {
    public static void main(String[] args) {
        boolean result = solution(")()(");
        System.out.println(result);
    }

    static boolean solution(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                if(count<=0){
                    return false;
                }
                count--;
            }
        }
        return count==0;
    }
}
