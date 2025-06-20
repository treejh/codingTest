class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int count=(int)Math.sqrt(i);
            int result=0;
            for(int j=1;j<=count;j++){
                if(i%j==0){
                    if(j==i/j){
                        result++;
                    }else{
                        result+=2;
                    }
                }
        }
             if(result>=3){
                answer++;
            }
        
    }
        
        return answer;
        
}
}