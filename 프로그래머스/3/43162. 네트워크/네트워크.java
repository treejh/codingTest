import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static boolean visit[];
    static Queue<Integer> que = new LinkedList<>();
    
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visit[i]==false){
                bfs(i,computers,n);
                answer++;
            }
        }
        
        
        return answer;
    }
    
    
    public void bfs(int i, int computers [][], int n){
        que.offer(i);
        visit[i]=true;
        
        //큐가 비어있지 않을때까지  -> 큐에 값이 있을때만 
        while(!que.isEmpty()){
            int value = que.poll();
            
            for(int j=0;j<n;j++){
                if(!visit[j] && computers[value][j]==1){
                    visit[j] = true;
                    que.offer(j);
                }
            }
        }
    }
}