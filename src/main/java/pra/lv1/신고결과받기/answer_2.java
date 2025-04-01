package pra.lv1.신고결과받기;

import java.util.HashMap;
import java.util.HashSet;

public class answer_2 {
    public static void main(String[] args) {
        // id_list 배열

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};

        // report 배열
        String[] report = {
                "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
        };

        // k 값
        int k = 2;

        // solution 메서드 실행
        int[] result = solution(id_list, report, k);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,HashSet<String>> userReportCount = new HashMap<>();
        HashMap<String,HashSet<String>> banUserCount = new HashMap<>();


        //유저별 신고당한 횟수
        //본인
        //본인이 신고한 애
        for(String content  : report){
            String[] reportContent = content.split(" ");
            //userReportCount.put(reportContent[1],userReportCount.getOrDefault(reportContent[1],0)+1);
            if(!userReportCount.containsKey(reportContent[1])){
                HashSet<String> user = new HashSet<>();
                user.add(reportContent[0]);
                userReportCount.put(reportContent[1],user);
            }else{
                HashSet<String> user = userReportCount.get(reportContent[1]);
                user.add(reportContent[0]);
                userReportCount.put(reportContent[1],user);
            }
        }


        //0은 본인
        //1은 본인이 신고한 애
        for(String content : report){
            String[] reportContent = content.split(" ");
            //banUser에 들어가 있으면,

            //바로 userReportCount.get size로 할 수 있지 않나 ?

            if(userReportCount.get(reportContent[1]).size()>=k){
                if(!banUserCount.containsKey(reportContent[0])){
                HashSet<String> banData = new HashSet<>();
                banData.add(reportContent[1]);
                banUserCount.put(reportContent[0], banData);
                }else{
                    HashSet<String> banData = banUserCount.get(reportContent[0]);
                    banData.add(reportContent[1]);
                    banUserCount.put(reportContent[0], banData);
                }
            }
        }

        //결과
        int[] answer = new int [id_list.length];

        for(int i=0;i<id_list.length;i++){
            if(banUserCount.containsKey(id_list[i])){
                answer[i] = banUserCount.get(id_list[i]).size();
            }else{
                answer[i] = 0;
            }
        }


        return answer;
    }
}
