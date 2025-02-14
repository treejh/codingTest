package pra.lv2.주식가격;

import java.util.LinkedList;
import java.util.Queue;

public class answer_3 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        prices = solution(prices);

        for (int data : prices) {
            System.out.print(data + " ");
        }
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //현재의 값이 뒤의 나머지 값들과 비교해서 큰 수를 만나면 count중단, answer에 기록
        //큐의 선입선출 특성을 이용해서 poll하면서 계산하기

        int index = 0;

        for (int i = 0; i < prices.length; i++) {

            Queue<Integer> test = new LinkedList<>();

            for(int k=0;k<prices.length;k++){
                test.offer(prices[k]);
            }

            int price = test.poll();


            for (int j = 0; j < test.size(); j++) {
                int nextData = test.poll();
                if (price <= nextData) {
                    answer[i]++;
                } else if (price > nextData) {
                    answer[i]++;
                    break;
                }
            }

        }

        return answer;

    }

        public static int[] solution2(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                Queue<Integer> test = new LinkedList<>();

                // 현재 위치부터 끝까지 값을 큐에 저장
                for (int k = i; k < prices.length; k++) {
                    test.offer(prices[k]);
                }

                int price = test.poll(); // 현재 주가 가져오기

                int count = 0;
                while (!test.isEmpty()) {
                    int nextData = test.poll();
                    count++; // 초 단위 증가

                    if (price > nextData) { // 가격이 떨어지면 중단
                        break;
                    }
                }
                answer[i] = count; // 결과 저장
            }

            return answer;
        }
    }


