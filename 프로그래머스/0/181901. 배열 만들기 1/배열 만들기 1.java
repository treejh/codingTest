import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=k;i<=n;i+=k){
            answer.add(i);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}