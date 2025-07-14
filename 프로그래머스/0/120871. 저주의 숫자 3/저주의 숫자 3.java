class Solution {
    public int solution(int n) {
        int count = 0;
        int num = 0;

        while (count < n) {
            num++;

            // 3의 배수이거나 숫자에 '3'이 포함되어 있다면 스킵
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }

            count++;
        }

        return num;
    }
}