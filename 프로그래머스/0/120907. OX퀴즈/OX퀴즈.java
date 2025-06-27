class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i =0;
        for(String data : quiz){
            String[] tmp = data.split(" ");
            
            int first =  Integer.parseInt(tmp[0]);
            int second = Integer.parseInt(tmp[2]);
            int result = Integer.parseInt(tmp[4]);
            
            if(tmp[1].equals("+")){
                if(first + second == result){
                    answer[i] ="O";
                    i++;
                }else{
                    answer[i] ="X";
                    i++;
                }
                
            }else if(tmp[1].equals("-")){
                  if(first - second == result){
                    answer[i] ="O";
                    i++;
                }else{
                    answer[i] ="X";
                    i++;
                }
            }   
        }
        return answer;
    }
}