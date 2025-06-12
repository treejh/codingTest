package pra.lv0.옹알이;

import java.util.HashSet;
import java.util.Set;

public class 옹알이 {

    public static void main(String[] args) {
        System.out.println(solution(new String [] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
        System.out.println("soluction2 : " +solution2(new String [] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    //첫번째 코드
    public static int solution(String[] babbling) {
        String [] dataList = {"aya", "ye", "woo", "ma"};

        int result=0;

        for(String data : babbling){
            boolean resultValid = true;

            String validData = data;
            Set<String> validList = new HashSet<>();
            while(!validData.isEmpty()){
                boolean isValid = false;
                for(String valid : dataList){
                    if(validData.startsWith(valid)){
                        if(validList.contains(valid)){
                            isValid=false;
                            break;
                        }
                        validList.add(valid);
                        validData = validData.substring(valid.length());
                        isValid=true;
                        break;
                    }
                }

                if(!isValid){
                    resultValid=false;
                    break;
                }

            }

            if(resultValid){
                result++;
            }

        }

        return result;

    }

    //두번째 코드
    public static int solution2(String[] babbling){
        int answer =0;
        for(int i=0;i<babbling.length;i++){
            babbling[i] = babbling[i].replace("aya","valid");
            babbling[i] = babbling[i].replace("ye","valid");
            babbling[i] = babbling[i].replace("woo","valid");
            babbling[i] = babbling[i].replace("ma","valid");
            babbling[i] = babbling[i].replace("valid","");
            if(babbling[i].isEmpty()){
                answer++;
            }

        }

        return answer;
    }
}
