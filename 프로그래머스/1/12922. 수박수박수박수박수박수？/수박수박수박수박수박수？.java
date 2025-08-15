class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String data [] = {"수","박"};
        
        for(int i=0;i<n;i++){
            answer.append(data[i%2]);
        }
        
        return answer.toString();
    }
}