class Solution {
    public int solution(int order) {
        int result = 0;
        String answer = String.valueOf(order);
        for(int i=0;i<answer.length();i++){
            char number = answer.charAt(i);
            if(number =='3' | number =='6' |number =='9' ){
                result ++;
            }
        }
        
        return result;
    }
}