package 프로그래머스.lv0.배열뒤집기;

public class answer_1 {
    public static void main(String[] args) {
    }

    public int[] solution(int[] numbers) {
        int[] newNumb = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            newNumb[i] = numbers[numbers.length - 1 - i];
        }

        return newNumb;
    }

}


