class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            String [] data = String.valueOf(array[i]).split("");
            
            for(int j=0;j<data.length;j++){
                if(data[j].equals("7")){
                    answer++;
                }
            }
            
        }
        return answer;
    }
}