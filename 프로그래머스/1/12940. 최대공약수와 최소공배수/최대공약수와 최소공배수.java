class Solution {
    public int[] solution(int n, int m) {
        int big = Math.max(n,m);
        int small = Math.min(n,m);
        int answer =1;
        
        while(true){
            if(big % small == 0){
                break;
            }
            answer = big % small;
            big = small;
            small = answer ;
        }
    
        
        
        return new int[] {small, (n*m)/small };
    }
}