package pra.lv0.입문;

public class 피자나눠먹기123 {

    public static void main(String[] args) {
        System.out.println(solution1(1));
        System.out.println(solution2(10));
        System.out.println(solution3(7,10));
    }
    //문제 1
    public static int solution1(int n) {
        if(n%7!=0){
            return (n/7)+1;
        }else{
            return n/7;
        }
    }

    //문제 2
    public static int solution2(int n) {
        int answer = 0;
        for(int i=1 ;i <=100 ;i++ ){
            if(((i*6)%n==0)){
                answer=i;
                break;
            }
        }
        return answer;
    }

    //문제3
    public static int solution3(int slice, int n) {
        return n % slice ==0 ? n/slice : (n/slice)+1;
    }
}
