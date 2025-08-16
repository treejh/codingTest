class Solution {
    public long solution(int price, int money, int count) {
        
        long data =0;
        for(int i=1;i<=count;i++){
            data+=(long)(price * i);
        }
        
        return Math.max(data-money,0);

    }
}