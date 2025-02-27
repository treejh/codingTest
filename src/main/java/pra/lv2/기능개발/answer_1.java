package pra.lv2.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class answer_1 {

    public static void main(String[] args) {
        int [] data = solution(new int [] {93, 30, 55},new int [] {1,30,5} );
        for(int i=0;i<data.length;i++){
            System.out.print(data[i] + " ");
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> remainDate = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainProgress = 100 - progresses[i];
            if (remainProgress % speeds[i] == 0) {
                remainDate.add(remainProgress / speeds[i]);
            } else {
                remainDate.add((remainProgress / speeds[i]) + 1);
            }
        }

        int currentData = remainDate.poll();
        int count =1;
        while(!remainDate.isEmpty()){
            if(currentData>=remainDate.peek()) {
                count++;
                remainDate.poll();
            }else{
                result.add(count);
                count=1;
                currentData=remainDate.poll();
            }
        }

        result.add(count);

        int [] resultData = new int[result.size()];
       for(int i=0;i<result.size();i++){
           resultData[i]=result.get(i);
       }
        return resultData;
    }

}
