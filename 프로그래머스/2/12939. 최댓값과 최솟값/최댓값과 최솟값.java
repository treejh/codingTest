class Solution {
    public String solution(String s) {
        String[] arr = s.split(" "); 
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        
        for(String numStr : arr){
            int num = Integer.parseInt(numStr);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        
        return min + " " + max;
    }
}