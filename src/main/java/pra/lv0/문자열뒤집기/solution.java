package pra.lv0.문자열뒤집기;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }

    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
    public String solution2(String my_string) {
        StringBuilder reverse = new StringBuilder();
        for(int i=my_string.length()-1;i>=0;i--){
            reverse.append(my_string.charAt(i));
        }
        
        return  reverse.toString();
    }

}
