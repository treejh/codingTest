class Solution {
        
    public boolean [] visited;
    public int answer = Integer.MAX_VALUE; 
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length+1];
        dfs(words, begin, target, 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    public void dfs(String[] words, String current, String end, int step){
        if(current.equals(end)){
            answer = Math.min(answer, step);
            return;
        }
        
        for(int i=0; i<words.length; i++){
            if(!visited[i] && canChange(current, words[i])){
                visited[i] = true;
                System.out.println("확인" + i+ " : " + words[i]);
                dfs(words, words[i], end, step+1);
                visited[i] = false; // 백트래킹
            }
        }
        
        
    }
    
    public boolean canChange(String current, String words){
        int cnt =0;
        for(int i=0;i<current.length();i++){
            if(current.charAt(i) != words.charAt(i)){
                cnt++;
            }
        }
        return cnt==1;
    }
    
    
}