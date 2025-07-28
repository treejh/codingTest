import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        
        int [] dx ={0,0,1,-1};
        int [] dy = {1,-1,0,0};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int []{0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int [] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];
            
            if(x == n-1 && y == m-1){
                return count ; 
            }
            
            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if( nx >= 0 && ny>=0 && nx < n 
                  && ny < m){
                     if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, count + 1});
                    }
                }
            }
            
        }
        return -1;
    }
}