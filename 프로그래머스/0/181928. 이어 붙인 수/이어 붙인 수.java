class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder ja = new StringBuilder();
        StringBuilder hole = new StringBuilder();
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2!=0){
                ja.append(num_list[i]);
            }else{
                hole.append(num_list[i]);
            }
        }
        
        return Integer.parseInt(ja.toString()) +Integer.parseInt(hole.toString()) ;
    }
}