class Solution {

    public int solution(int n) {
        int answer = 0;
        long[] arr=new long[n+1];
        
        arr[0]=0L;
        arr[1]=1L;

        for(int i=2; i<=n; i++){
            arr[i]=(arr[i-1]+arr[i-2])%1234567L;
        }
        
        answer=(int)(arr[n]);
        
        return answer;
    }
}
