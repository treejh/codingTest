package pra.lv0.입문;

public class 제곱수판별 {

    public static void main(String[] args) {
        System.out.println(solution(144));
    }
        public static int solution(int n) {

            if(Math.sqrt(n)%1==0){
                return 1;
            }
            else{
                return 0;
            }

        }
    }
