class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n]; //false
        
        for(int i=0;i<n;i++){
            if(!visited[i]){ //false 이면 방문 안한거임
                bfs(i,computers,visited);
                answer++; 
            }
        }
        
        return answer;
    }
    
    public void bfs(int current, int [][] computers, boolean [] visited){
        
        visited[current]=true;
        
        for(int i=0;i<computers.length;i++){
            if(computers[current][i] == 1 && !visited[i]){
                bfs(i,computers,visited);
            }
        }
        
    }
}