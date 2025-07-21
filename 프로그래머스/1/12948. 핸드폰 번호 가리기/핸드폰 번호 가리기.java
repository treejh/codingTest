class Solution {
    public String solution(String phone_number) {
        String lastLength = phone_number.substring(phone_number.length()-4);
        StringBuilder result = new StringBuilder();
        
        for(int i=0 ; i<phone_number.length()-4;i++){
            result.append("*");
        }
        
        result.append(lastLength);
        

        return result.toString();
    }
}