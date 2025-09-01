class Solution {
    public int solution(int n) {
        long arr []  = new long [2];
        arr[0] = 0;
        arr[1] = 1;
        long fibo =0;
        for(int i=2;i<=n;i++){
            fibo = (arr[0] + arr[1]) % 1234567;  
            arr[0] = arr[1];
            arr[1] = fibo;
        }
        return (int)fibo;
    }
}