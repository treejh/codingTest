class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int weight = board[0] / 2 ;//가로
        int height = board[1] / 2 ;//세로 

        int x = 0;
        int y =0;
        
        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("left")&&x>-weight){
                x+=-1;
                continue;
            }else if(keyinput[i].equals("right")&&x<weight){
                x+=1;
                continue;
                
            }else if(keyinput[i].equals("up")&&y<height){
                y+=1;
                continue;
            }else if(keyinput[i].equals("down")&&y>-height){
                y+=-1;
                continue;
                
            }
        }
        return new int [] {x,y};
    }
}