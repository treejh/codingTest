package 프로그래머스.lv1.실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class answer_2 {

    public static void main(String[] args) {
        answer_2 algo2 = new answer_2();
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        String stage = scan.nextLine();

        int [] stages = Arrays.stream(stage.split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] a = algo2.solution(n,stages);
        for(int i : a){
            System.out.print(i + " ");
        }


    }

    public int [] solution(int n, int[] stages){
        int nPlayers = stages.length;
        int [] stagePlayers = new int[n+2];

        for(int player : stages){
            stagePlayers[player] +=1;
        }

        List<stageVa> countStagePlayer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            double fail = stagePlayers[i]/(double)nPlayers;

            countStagePlayer.add(new stageVa(i,fail));
            nPlayers-=stagePlayers[i];
        }

        return countStagePlayer.stream().sorted((a,b) -> Double.compare(b.fail,a.fail))
                .mapToInt(stageVa -> stageVa.stage).toArray();



    }

    public class stageVa {
        double fail;
        int stage;

        public stageVa(int stage,double fail) {
            this.fail = fail;
            this.stage = stage;
        }

    }

}

