import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] priorities, int location) {
        //숫자가 클수록 우선순위가 높다 
        //프로세스가 몇번째로 실행되는지
        //location은 0부터 시작 프로세스 이름 ㅇㅇ 
        //몇번째 return 1부터 시작 
        
        Queue<int []> data = new ArrayDeque<>();
         for(int i=0;i<priorities.length;i++){
            data.offer(new int []{i ,priorities[i]});
        }
        //숫자 확인 
        int count =1;
        while(!data.isEmpty()){ 
           int [] current = data.poll();
            int index = current[0];
            int pri = current[1];
            
            boolean checkpri = false;
            //pri보다 우선순위가 큰 프로세스가 있다면 break
            for(int[] process : data){
                if(pri < process[1]){
                    checkpri=true;
                    break;
                }
            }
            
            //뒤에 우선순위가 더 큰게 있음 
            if(checkpri){
                 data.offer(current);
            }else{
                if(index == location){
                    return count;
                }
                count++;
            }
            
        }
        
        return count;
    }
}