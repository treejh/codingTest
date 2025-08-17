class Solution {
    public int solution(String t, String p) {
        Long temp = Long.parseLong(p);
        int answer =0;
        
        //p개전까지만 하고 마지막은 따로 비교 
        for(int i=0;i<=t.length() - p.length();i++){
            String data = t.substring(i,i+p.length());
            if(Long.parseLong(data) <=temp){
                answer++;
            }
            
        }
        
        return answer;
    }
}