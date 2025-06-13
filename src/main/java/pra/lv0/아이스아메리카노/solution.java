package pra.lv0.아이스아메리카노;

public class solution {
    public static void main(String[] args) {
        int [] result = solution(5500);
        System.out.println(result[0]+ ": "+ result[1]);
    }

    //첫번째 코드
    public static int[] solution(int money) {

        int result =0;
        while(money >= 5500){
            money -=5500;
            result++;
        }
        return new int[] {result,money};
    }

    //두번째 코드
    public static int[] solution2(int money) {

        return new int [] {money/5500, money%5500};
    }


}
