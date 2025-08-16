class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++){
            int data =0;
            for(int j = 1; j<=Math.sqrt(i);j++){
                if(j*j == i){
                    data+=1;
                }else if(i%j==0){
                    data+=2;
                }
            }
            if(data%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
            
        }
        
        return answer;
    }
}