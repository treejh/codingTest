class Solution {
    public boolean solution(int x) {

        int numSum = 0;
        String [] data = String.valueOf(x).split("");
        for(String num : data){
            numSum+=Integer.valueOf(num);
        }
        
        if(x%numSum==0){
            return true;
        }else{
            return false;
        }
        
    }
}