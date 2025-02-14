package pra.lv2.주식가격;

public class answer_1 {

    public static void main(String[] args) {
        int [] prices = {1, 2, 3, 2, 3};

        prices = solution(prices);

        for(int data : prices){
            System.out.print(data + " ");
        }
    }

    public static int[] solution(int[] prices) {

        //각 값 s의 가격은 1 ~ 10,000이하 자연수이다.
        //prices의 길이는 2 이상 ~ 100,000 이하 이다.

        int [] count = new int [prices.length];


        for(int i=0; i<prices.length;i++){
            //3일때
            int validData = prices[i];

            //i+1부터 하면 i의 다음 순서부터 차례대로 비교할 수 있다.
            for(int j=i+1;j<prices.length;j++){
                //현재 위치의 값보다 다음값이 크다면 가격이 유지 된 것이다.
                if(validData<=prices[j]){
                    //해당 되는 위치에 값을 더해준다.
                    count[i]++;
                }
                //현재 데이터보다 다음 데이터 값이 작다는 것은 값이 유지 되지 않았다는 것 (작아짐)
                //하지만 현재 데이터 1초 동안은 유지 된것이기 때문에 ++를 해주고, 반복문 종료
                else if(validData>prices[j]){
                    count[i]++;
                    break;
                }
            }
        }
        return count;
    }
}
