import java.util.HashSet;
import java.util.Set;


class Solution {
    public int solution(int[] nums) {
        Set<Integer> monster = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            monster.add(nums[i]);
        }
    
        return Math.min(monster.size(),nums.length/2);
    }
}