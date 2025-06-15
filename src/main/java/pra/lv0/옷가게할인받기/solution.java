package pra.lv0.옷가게할인받기;

public class solution {

    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution2(150000));
    }


    //첫번째 문제 풀이
    public static int solution(int price) {
        if(price >= 500000 ){
            double discount = discountCal(20);
            return (int) (price - ( discount * price));
        }
        else if(price >= 300000){
            double discount = discountCal(10);
            return (int) (price - ( discount * price));
        }else if(price >= 100000){
            double discount = discountCal(5);
            return (int) (price - ( discount * price));
        }else{
            return price;
        }
    }

    public static double discountCal(int n){
        return (double) n / 100;
    }


    //두번째 문제풀이
    public static int solution2(int price){

        if(price >= 500000 ){
            return (int) (price * 0.8);
        }else if(price >= 300000){
            return (int) (price * 0.9);
        }
        else if(price >= 100000){
            return (int) (price * 0.95);
        }else{
            return price;
        }
    }
}
