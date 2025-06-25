class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n); 
        StringBuffer sb = new StringBuffer(str).reverse(); 
        
        
        int[] result = new int [str.length()];
        
        for(int i=0;i<sb.length();i++){
            result[i] = Character.getNumericValue(sb.charAt(i));
        }

        return result;
    }
}