class Solution {
    public int[][] solution(int[] num_list, int n) {
        int x = num_list.length/n;
        int[][] answer = new int[x][n];
        int cnt=0;
        
        for(int i=0;i<x;i++){
            for(int j=0;j<n;j++){
                answer[i][j]=num_list[cnt];
                cnt++;
            }
        }
        
        return answer;
    }
}