package pra.lv2.다리를지나는트럭;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class answer_1 {

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int [] {7,4,5,6}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> waitTruck = new LinkedList<>();
        int count =0;
        //Queue<CrossTruck> crossTrucks = new LinkedList<>();
        HashMap<Integer,Integer> crossTrucks = new HashMap<>();
        for(int data : truck_weights){
            waitTruck.add(data);
        }

        //weight = 다리 무게
        //bridge_length = 다리에 올라갈 수 있는 트럭 수
        //트럭이 빈다면 멈춤 = 트럭이 비어있지 않을때만 while
        while(!waitTruck.isEmpty()){

            //만약 다리를 건너는 트럭이 비어있다면 데이터를 넣는다.
            if(crossTrucks.isEmpty()){
                crossTrucks.put(count,waitTruck.poll());
                count++;

            }else{
                //다리를 지나갈 수 있는 트럭이 있는지 확인
                Iterator<Integer> iterator=crossTrucks.keySet().iterator();
                for(int i=0;i<crossTrucks.size();i++){
                    int timeCount = iterator.next();
                    if((timeCount+bridge_length)==count){
                        crossTrucks.remove(timeCount);
                    }
                }
//                for(Integer truck : crossTrucks.keySet()){
//                    if((truck+bridge_length)==count){
//                        crossTrucks.remove(truck);
//                    }
//                }
                int currentBridgeWeight = 0;
                //다리위에 있는 트럭의 무게를 구한다.
                for (Integer weightData : crossTrucks.values()) {
                    currentBridgeWeight += weightData;
                }
                //현재 들어가야 할 대기트럭의 무게도 같이 더해줌
                currentBridgeWeight+=waitTruck.peek();

                //위에 올라가지 못하는 상태가 되면
                if(crossTrucks.size()>bridge_length || currentBridgeWeight>weight){
                    count++;
                }else{
                    crossTrucks.put(count,waitTruck.poll());
                    count++;
                }

            }
        }

        return count+bridge_length;
    }

    public static class CrossTruck{
        int crossTime;
        int weight;

        public CrossTruck(int crossTime, int weight) {
            this.crossTime = crossTime;
            this.weight = weight;
        }
    }
}
