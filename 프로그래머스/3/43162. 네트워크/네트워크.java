class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean [] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){ //아직 방문하지 않았다면
                dfs(i,computers,visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int current, int [][] computers, boolean[] visited){
        visited[current]= true;
        
        for(int i=0;i<computers.length;i++){
            if(computers[current][i] == 1 && visited[i] == false){
                dfs(i,computers,visited);
            }
        }
        
    }
}