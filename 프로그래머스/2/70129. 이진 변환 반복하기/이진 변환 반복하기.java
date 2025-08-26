import java.util.ArrayList;
class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> data = new ArrayList<>();
        String answer = s;
        
        int dif = 0;
        int zero = 0;  
        
        while(answer.length()!=1){
        StringBuilder sb = new StringBuilder();
        int length  = answer.length();
        //0의 개수 카운트 
        for(int i=0;i<answer.length();i++){
            if(answer.charAt(i) =='0'){
                zero++;
            }
        }
        length = answer.replaceAll("0","").length();
        
        //이진수로 변환 
        while(length!=0){
            sb.append(length % 2);
            length = length/2;
        }
        dif++;
        answer = sb.toString();
           
        }
        return new int []{dif,zero};
    
    }
}