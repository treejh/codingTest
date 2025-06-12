package pra.lv0.다음에올숫자;

public class solution {
        public int solution(int[] common) {

            if(common[1]-common[0] == common[2]-common[1]){
                int data = common[1]-common[0];
                return common[common.length-1]+data;
            }else{
                int data = common[1]/common[0];
                return common[common.length - 1] * data;
            }

        }
    }

