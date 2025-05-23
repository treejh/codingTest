package pra.lv1.신고결과받기;

import java.util.HashMap;
import java.util.HashSet;

public class answer_1 {
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
        HashSet<String> banUser = new HashSet<>();
        //신고를 당한 사람, 신고한 사람
        HashMap<String,HashSet<String>> userReportCount = new HashMap<>();
        HashMap<String,HashSet<String>> banUserCount = new HashMap<>();


        //유저별 신고당한 횟수
        //본인 0 본인이
        //본인이 신고한 애 1본인이 신고한애
        for(String content  : report){
            String[] reportContent = content.split(" ");
            //userReportCount.put(reportContent[1],userReportCount.getOrDefault(reportContent[1],0)+1);
            if(!userReportCount.containsKey(reportContent[1])){

                userReportCount.computeIfAbsent(reportContent[1], s -> new HashSet<>()).add(reportContent[0]);

            }
            else{
                userReportCount.computeIfAbsent(reportContent[1], s -> new HashSet<>()).add(reportContent[0]);
            }




        }


        //정지된 아이디
        for(String name : userReportCount.keySet()){
            if(userReportCount.get(name).size()>=k){
                banUser.add(name);
            }
        }

        //0은 본인
        //1은 본인이 신고한 애
        for(String content : report){
            String[] reportContent = content.split(" ");
            //banUser에 들어가 있으면,
            if(banUser.contains(reportContent[1])) {
                if (!banUserCount.containsKey(reportContent[0])) {
                    banUserCount.computeIfAbsent(reportContent[0], s -> new HashSet<>()).add(reportContent[1]);
                } else {
                    banUserCount.computeIfAbsent(reportContent[0], s -> new HashSet<>()).add(reportContent[1]);
                }
            }
        }
        System.out.println(" --======== ");
        for(String data : banUserCount.keySet()){
            System.out.println(data + " : " +userReportCount.get(data));
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
