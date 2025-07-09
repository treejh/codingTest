import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] sides) {
        int maxValue = Math.max(sides[0], sides[1]);
        int minValue = Math.min(sides[0], sides[1]);
        Set<Integer> data = new HashSet<>();

        // 가장 긴 변이 sides의 두 수 중 하나일 때 가능한 나머지 한 변
        for (int i = maxValue - minValue + 1; i <= maxValue; i++) {
            data.add(i);
        }

        // 나머지 한 변이 가장 긴 변일 때 가능한 경우
        for (int j = maxValue + 1; j < maxValue + minValue; j++) {
            data.add(j);
        }

        return data.size();
    }
}