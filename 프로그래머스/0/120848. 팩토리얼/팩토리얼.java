class Solution {
    public int solution(int n) {
        int count=1;
        int answer =1;
        while(true){
            if(answer>n){
                count-=1;
                break;
            }  
            count++; 
            answer  = answer * count ;  
        }
        return count;
    }
}