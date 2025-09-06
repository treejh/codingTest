class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        long total = brown  + yellow; 
        //가로 길이의 값이 brown보다 작아야함 

        for(int i=1;i<=Math.sqrt(total); i++){
            int tmp = (int)(total / i) ;
           if (total%i == 0 && i <= tmp && i >=2 ){
           
               if((tmp-2) * (i-2) == yellow){
                   return new int []{tmp,i};
               }
            }
        }
    
    return new int []{0,0};
}
}