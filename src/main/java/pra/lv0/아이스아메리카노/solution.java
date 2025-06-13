package pra.lv0.아이스아메리카노;

public class solution {
    public static void main(String[] args) {
        int [] result = solution(5500);
        System.out.println(result[0]+ ": "+ result[1]);
    }

    public static int[] solution(int money) {
        int remainMoney = money;

        int result =0;
        while(remainMoney >= 5500){
            remainMoney -=5500;
            result++;
        }
        return new int[] {result,remainMoney};
    }

    public static int[] solution2(int money) {

        return new int [] {money/5500, money%5500};
    }


}
