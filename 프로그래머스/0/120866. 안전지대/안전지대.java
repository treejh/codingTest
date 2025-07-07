class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int [][] boardList = new int [board.length+2][board.length+2];
        
    
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==1){
                    for(int x =i;x<=i+2;x++){
                        for(int y=j;y<=j+2;y++){
                            if(boardList[x][y] != 1){
                                boardList[x][y] = 2;
                            }
                            
                        }
                    }
                }
                
            }
            
        }
        for(int d=1;d<boardList.length-1;d++){
            for(int j = 1;j<boardList.length-1;j++){
                if(boardList[d][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}