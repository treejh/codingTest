package pra.lv1.크레인인형뽑기게임;

import java.util.Stack;

public class answer_1 {

    public static void main(String[] args) {
        int[][] array = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int [] size = {1,5,3,5,1,2,1,4};

        System.out.println(solution(array,size));
    }

    public static int solution(int[][] board, int[] moves) {

        //열을 기준으로 데이터를 뽑는다.
        //해당 위치 데이터를 뽑으면, 값을 0으로 바꾼다.
        //바구니의 사이즈는 격자 크기만큼 예를들어 4x4 라면, 바구니 사이즈는 16
        //바구니는 스택을 사용한다.
        //바구니 작동과정
        // 1. 바구니에 마지막으로 들어온 데이터와, 현재 데이터를 비교한다.
        // 2. 만약 두개의 데이터가 같다면, 스택에 있는 데이터를 pop하고
        // 3. 현재 데이터는 stack에 포함하지 않는다.
        // 4. 만약 데이터가 같다면 result에 값을 +1을 해주어야 한다.

        //크레인 작동 과정
        // 1. 예를 들어 1번째 열을 선택 한다면
        // 2. 1번째 열의 행을 n ...1 사이즈로 돈다.
        // 3. 만약 데이터가 있다면 해당 데이터를 stack에 넣어주고
        // 4. 해당 데이터는 삭제 된다.
        int boardSize = board.length;
        Stack<Integer> basket = new Stack<>();
        int result =0;

        for(int i=0;i<moves.length;i++){
            //크레인이 이동할 열 위치를 저장한다.
            //값이 1부터 시작되기 때문에 -1을 해주었다.
            int col = moves[i]-1;
            //board size만큼 해당 열에서 for문을 돌린다.
            for(int j=0;j<boardSize;j++){
                //만약 해당 열에서 만나는 첫번째 값이 0이 아니라면 스택에 push해준다.
                //바구니 작동과정
                // 1. 바구니에 마지막으로 들어온 데이터와, 현재 데이터를 비교한다.
                // 2. 만약 두개의 데이터가 같다면, 스택에 있는 데이터를 pop하고
                // 3. 현재 데이터는 stack에 포함하지 않는다.
                // 4. 만약 데이터가 같다면 result에 값을 +1을 해주어야 한다.
                int currentData = board[j][col];
                if(currentData!=0){
                    board[j][col]=0;
                    if(basket.empty() || basket.peek()!=currentData){
                        basket.push(currentData);
                        break;
                    }else if(basket.peek()==currentData){
                        basket.pop();
                        result+=2;
                        break;
                    }
                }

            }

        }

        return result;
    }
}

