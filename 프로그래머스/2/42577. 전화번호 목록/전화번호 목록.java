import java.util.HashSet;
import java.util.Set;


class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> startData = new HashSet<>();
        
        for(String data : phone_book){
            startData.add(data);
        }
        
            
        //검사
        for(String data : phone_book){
            for(int i=1;i<data.length();i++){
                if(startData.contains(data.substring(0,i))){
                    return false;
                }
                
            }
        }
        
        
        
        
        return true;
    }
}