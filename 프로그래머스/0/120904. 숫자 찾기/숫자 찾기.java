class Solution {
    public int solution(int num, int k) {

        String numS = String.valueOf(num);
        String kS = String.valueOf(k);
        int answer = -1;
        answer = numS.indexOf(kS);

        return answer == -1 ? -1 : answer+1 ;
    }
}