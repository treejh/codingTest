package pra.lv0.입문;

public class 기약분수 {

    public static void main(String[] args) {
        int [] data = solution(1,2,3,4);

        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }

        public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

            int numer3 = numer1 * denom2 + numer2 * denom1;
            int denom3 = denom1 * denom2;
            int remain = 1;
            int result = 1;

            int a = numer3;
            int b = denom3;

            while(remain !=0){
                if(numer3>denom3){
                    remain = mod(numer3,denom3);
                    if(remain == 0){
                        result = denom3;
                    }
                    numer3 = remain;
                }else{
                    remain = mod(denom3,numer3);
                    if(remain == 0){
                        result = numer3;
                    }
                    denom3 = remain;
                }
            }


            return new int [] {a/result,b/result};
        }

        public static int mod(int big, int small){
            return big % small;
        }
    }

