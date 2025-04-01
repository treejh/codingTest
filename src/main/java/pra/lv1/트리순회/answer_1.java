package pra.lv1.트리순회;

public class answer_1 {
    public static void main(String[] args) {
        solution(new int [] {1,2,3,4,5,6,7} );
    }

    public static String[] solution(int[] arr) {
        String[] answer = new String[3];


        //전위 순회
        //루트 -> 왼쪽 -> 오른쪽
        //왼쪽 *2, 오른쪽 *2+1
        String data = preOrder(arr,0);
        System.out.println(data);

        String data2= inOrder(arr,0);
        System.out.println(data2);

        String data3 = postOrder(arr,0);
        System.out.println(data3);
        answer[0]=data;
        answer[1]=data2;
        answer[2]=data3;
        return answer;

        //중위 순회
        // 왼쪽 -> 루트 -> 오른쪽

        //후위 순회
        //왼쪽 -> 오른쪽 -> 루트

    }

    private static String preOrder(int [] nodes, int idx){
        if(idx>=nodes.length){
            return "";
        }

        return nodes[idx]+" "+preOrder(nodes,(2*idx)+1)+preOrder(nodes,(2*idx)+2);
    }

    private static String inOrder(int [] nodes, int idx){
        if(idx>=nodes.length){
            return "";
        }

        return inOrder(nodes,(2*idx)+1)+nodes[idx]+" "+inOrder(nodes,(2*idx)+2);
    }

    private static String postOrder(int [] nodes, int idx){
        if(idx>=nodes.length){
            return "";
        }

        return postOrder(nodes,(2*idx)+1)+postOrder(nodes,(2*idx)+2)+nodes[idx]+" ";
    }


}
