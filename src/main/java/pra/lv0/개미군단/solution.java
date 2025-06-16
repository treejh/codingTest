package pra.lv0.개미군단;

import java.util.HashMap;

public class solution {

    public int solution(int hp) {
        int answer = 0;

        while(hp>0){
            if(hp>=5){
                answer +=hp/5;
                hp = hp%5;
            }else if(hp>=3){
                answer +=hp/3;
                hp = hp%3;
            }else{
                answer +=hp/1;
                hp = hp%1;
            }
        }
        return answer;
    }

    public int solution2(int hp) {
        HashMap<String,String> a = new HashMap<>();
        return hp / 5 + (hp%5) / 3 + hp%5%3;
    }


}
