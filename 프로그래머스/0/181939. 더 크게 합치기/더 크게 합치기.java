class Solution {
    public int solution(int a, int b) {
        String temp1 = String.valueOf(a);
        String temp2 = String.valueOf(b);
        
        StringBuilder answer1 = new StringBuilder();
        answer1.append(temp1);
        answer1.append(temp2);
        StringBuilder answer2 = new StringBuilder();
        answer2.append(temp2);
        answer2.append(temp1);
        
        
        return  Integer.parseInt(answer1.toString()) > Integer.parseInt(answer2.toString()) ? Integer.parseInt(answer1.toString()) : Integer.parseInt(answer2.toString());
    }
}