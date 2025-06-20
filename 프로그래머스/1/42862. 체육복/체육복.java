import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        //학생들이ㅡ 번호 체격순 
        //바로 앞 번호 학생이나 바로 뒷 번호 학생에게만 빌려줄 수 있음 
        // 4번 학생은 3, 5번만 가능 
        //본인이 도난당했다면, 다른 학생에게 빌려주기 불가능 
        
        //lost 도난
        //reverse 여분이 있는 애들 리스트 
        Set<Integer> reverseList = new HashSet<>();
        for(int data : reserve){
            reverseList.add(data);
        }
        
        //본인이 잃어버리고, 여분이 있는경우 제외 
        Set<Integer> lostList = new HashSet<>();
        for(int i=0;i<lost.length;i++){
            //본인이 도난 당한경우 
            if(reverseList.contains(lost[i])){
                reverseList.remove(lost[i]);
                answer++;
            }else{
                lostList.add(lost[i]);
            }
        }   
        
        for(Integer lostData : lostList){
            //앞
             if(reverseList.contains(lostData-1)){
                answer++;
                reverseList.remove(lostData-1);
            //뒤
            }else if(reverseList.contains(lostData+1)){
                      answer++;
                reverseList.remove(lostData+1);
            }
        }
        
        
        return answer;
    }
}