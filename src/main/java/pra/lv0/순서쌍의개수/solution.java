package pra.lv0.순서쌍의개수;

public class solution {
    public int solution(int n) {
        int answer = 0;
        for(int i= 1; i * i <= n;i++){
            if(i*i == n){
                answer++;
            }else if(n % i==0){
                answer+=2;
            }
        }

        return answer;
    }

    public int solution2(int n) {
        int limit = (int)Math.sqrt(n);
        int result =0;

        for(int i=1;i<=limit;i++){
            if(n%i==0){
                if(i == n/i){
                    result++;
                }else{
                    result+=2;
                }

            }
        }
        return result;

    }

}
