class Solution {
    boolean solution(String s) {
        String lowerData = s.toLowerCase();
        int countP = 0;
        int countY=0;
        
        if(!lowerData.contains("p") && !lowerData.contains("y")){
            return true;
        }
           
        for(char data : lowerData.toCharArray()){
            if(data=='p'){
                countP++;
            }else if (data=='y'){
                countY++;
            }
        }
         
        return countP==countY? true : false;
    }

}