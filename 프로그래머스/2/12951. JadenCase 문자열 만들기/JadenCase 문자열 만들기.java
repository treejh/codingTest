class Solution {
    public String solution(String s) {
        String [] list = s.split(" ", -1 );
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<list.length;i++){
              if (!list[i].isEmpty()) {
                char first = list[i].charAt(0);
                if (Character.isDigit(first)) {
                    answer.append(first);
                } else {
                    answer.append(Character.toUpperCase(first));
                }

                if (list[i].length() > 1) {
                    answer.append(list[i].substring(1).toLowerCase());
                }
            }
                
                // 여기서만 공백 추가 (다음 단어가 있어도, 없어도)
            if (i != list.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}