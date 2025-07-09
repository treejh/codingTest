class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String data : dic){
            String ans = data;
            for(String spellData : spell){
                ans = ans.replaceFirst(spellData,"");
            }
            if(ans.trim().length()==0 && data.length()==spell.length){
                answer= 1;
                return answer;
            }
        }
        return answer;
    }
}