class Solution {
    public int solution(int n) {
        StringBuilder data = new StringBuilder();
        int answer = 0;
        
        while(true){
            if(n ==0){
                break;
            }
            data.append(n%3);
            n=n/3;
        }
        String result = data.toString();
        
        for (int i = 0; i < result.length(); i++){
            answer += (result.charAt(i) -'0') * Math.pow(3, result.length()-i-1);
        }
        return answer;
    }
}