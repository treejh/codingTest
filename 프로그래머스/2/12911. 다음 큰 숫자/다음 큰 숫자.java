class Solution {
    public int solution(int n) {
        int tmp = n+1;
        Long count = countData(n);
        while(true){
            Long eq = countData(tmp);
            if(eq == count){
                break;
            }
            tmp ++;    
        }
        
        return tmp;
    }
    
    public Long countData(int n){
        Long count =0L;
        while(true){
            if(n==1){
                return count;
            }
            if(n%2==1){
                count++;
            }
            n = n /2;
        }
    }
}