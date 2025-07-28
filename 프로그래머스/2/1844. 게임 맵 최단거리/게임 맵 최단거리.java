import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        Queue<int [] > queue = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
        
        int nx[] = {1,-1,0,0};
        int ny[] = {0,0,1,-1};
        
        boolean[][] visited = new boolean[n][m];
        queue.add(new int []{0,0,1});
        visited[0][0]=true;
        
        while(!queue.isEmpty()){
            int[] data = queue.poll();
            int x = data[0];
            int y = data[1];
            int count = data[2];
            
            if(x == n-1 && y == m-1 ){
                return count;
            }
            
            for(int i=0;i<4;i++){
                int countx = x+nx[i];
                int county= y + ny[i];
                
                 if(countx >=0 && county>=0 && countx < n && county < m ){
                     if(maps[countx][county]==1 && !visited[countx][county]){
                         visited[countx][county] = true;
                        queue.add(new int []{countx,county,count+1});
                     }
                 }
                
            }
        }
        
    
        return -1;
    }
}