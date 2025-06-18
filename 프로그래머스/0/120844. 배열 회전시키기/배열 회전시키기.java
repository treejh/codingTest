class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        
        if(direction.equals("right")){
             for(int i=0;i<numbers.length;i++){
            //right인 경우 
            answer[(i+1)%numbers.length] = numbers[i] ;
             }
        }else{
            for(int i=0;i<numbers.length;i++){      
            //left인 경우 
            answer[i] = numbers[(i+1)%numbers.length] ;
             } 
        }
            
    
        return answer;
    }
}