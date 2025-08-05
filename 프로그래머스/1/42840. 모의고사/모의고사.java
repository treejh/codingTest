import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int [] person0 = {1, 2, 3, 4, 5};
        int [] person1 ={2, 1, 2, 3, 2, 4, 2, 5};
        int [] person2 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int [] result = new int[3];
        ArrayList<Integer> answerP = new ArrayList<>();
        
        
        for(int i=0;i<answers.length;i++){
            if(person0[i%person0.length]==answers[i]){
                result[0]++;
            }
             if(person1[i%person1.length]==answers[i]){
                result[1]++;
            }
             if(person2[i%person2.length]==answers[i]){
                result[2]++;
            }
            
        }
        
        int MaxData = 0;
        for(int i=0;i<result.length;i++){
            MaxData = Math.max(result[i],MaxData);
        }
        
        for(int i=0;i<result.length;i++){
            if(result[i]==MaxData){
                answerP.add(i+1);
            }
        }
        
        
        return answerP.stream().mapToInt(Integer::intValue).toArray();
    }
}