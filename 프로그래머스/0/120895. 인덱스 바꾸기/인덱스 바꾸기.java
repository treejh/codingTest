class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char num1Word = my_string.charAt(num1);
        char num2Word = my_string.charAt(num2);
        char[] data = my_string.toCharArray();
        
        data[num1]  = num2Word;
        data[num2] = num1Word;
        
        
        return String.valueOf(data) ;
    }
}