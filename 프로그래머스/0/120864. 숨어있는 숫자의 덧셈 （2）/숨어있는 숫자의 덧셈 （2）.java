class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String onlyNumbers = my_string.replaceAll("[^0-9]"," ");
        String [] numbersList = onlyNumbers.trim().split(" ");

        for(String number : numbersList ){
            if (!number.isEmpty()) {  // 빈 문자열이면 건너뜀
            answer += Integer.parseInt(number);
    }
        }
        return answer;
    }
}