import java.util.ArrayList;


class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                result.add(i);
                  if (i != n / i) {
                    result.add(n / i);
                }
            }
        }
        
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}