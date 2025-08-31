class Solution {
    public int solution(int a, int b, int n) {
        int remain  = n;
        int total = 0;
        while(true){
            if(remain < a){
                break;
            }
            int give = remain / a ;
            int newB = give * b;
            total += newB;
            remain = newB + (remain % a);
            
        }
        
    
        return total;
    }
}