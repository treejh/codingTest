class Solution {
    public int solution(String my_string) {
        
        String [] oper = my_string.split(" ");
        int result = Integer.parseInt(oper[0]);
        
        for(int i=1;i<oper.length;i+=2){
             String operator = oper[i]; 
            int data = Integer.parseInt(oper[i+1]);
            
            if(operator.equals("+")){
                result +=data;
            }else{
                result -=data;
            }
            
        }  
        
        return result;

    
    }
}