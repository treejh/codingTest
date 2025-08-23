class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        //물을 먼저 먹는 선수가 우승 
        //두 선수가 먹는 음식의 종류와 양이 같아야함
        //음식을 먹는 순서도 같아야함
        //칼로리가 낮은 음식을 먼저 먹ㅁ게 
        
        for(int i=1;i<food.length;i++){
            int count = food[i] / 2 ;
            for(int j=0;j<count;j++){
                answer.append(i);
            }
        }
        answer.append('0');
         
        for(int i=food.length-1;i>0;i--){
            int count = food[i] / 2 ;
            for(int j=0;j<count;j++){
                answer.append(i);
            }
        }
        
        
        
        return answer.toString();
    }
}