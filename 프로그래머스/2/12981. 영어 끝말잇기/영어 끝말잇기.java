import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        
        Set<String> usedWords = new HashSet<>();
        char beforeWord = words[0].charAt(0);
        
        for(int i=0;i<words.length;i++){
            
            if(usedWords.contains(words[i]) || words[i].charAt(0) != beforeWord){
                return new int [] {(i%n)+1 ,(i/n)+1};
            }
            usedWords.add(words[i]);
            beforeWord = words[i].charAt(words[i].length()-1);
            }




        return new int []{0,0};
    }
}