package pra.lv3.표편집;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class answer_1 {
    public static void main(String[] args) {

        String []  list = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};

        System.out.println(solution(8,2,list));


    }

    public static String solution(int n, int k, String[] inputCmd) {
        //처음 표의 행의 개수를 나타내는 정수  : n
        //행의 위치를 나타내는 정수  : k
        //수행할 명령어 들은 Map을 사용한다.
        ArrayList<Cmd> cmdList = makeCmdList(inputCmd);
        for(Cmd cmd : cmdList){
            System.out.println(cmd.getCmdName() + " : " + cmd.getCount());
        }

        Stack<Integer> currentList = new Stack<>();

        for(int i=n-1;i>=0;i--){
            currentList.push(i);
        }


        ArrayList <Integer> deleteList = new ArrayList<>();

        Boolean [] result = new Boolean[n];
        Arrays.fill(result, Boolean.TRUE);

        //데이터는 n까지 0..n 순서대로 있다.
        for(int i=0;i<cmdList.size();i++){
            Cmd currentCmd = cmdList.get(i);
            if(currentCmd.getCmdName().equals("U")){
                k  = k - currentCmd.getCount();
            }
            else if (currentCmd.getCmdName().equals("D")){
                k = k + currentCmd.getCount();
            }
            else if(currentCmd.getCmdName().equals("C")){
                //k위치 까지 데이터를 빼기 위한 배열을 만든다.
                int [] data = new int [k];
                //k위치까지 데이터 다 빼버린다.
                for(int j=0;j<k;j++){
                    data[j] = currentList.pop();
                }
                //삭제된 데이터를 휴지통에 넣는다.
                deleteList.add(data[k-1]);
                result[k-1] = false;

                //k를 제외하고 다시 스택에 데이터를 넣는다.
                for(int q =k-2; q>=0; q--){
                    currentList.push(data[q]);
                }
                k=k-1;
            }
            else if(currentCmd.getCmdName().equals("Z")){
                if(deleteList.isEmpty()){
                    continue;
                }
                //제일 마지막으로 들어간 값을 가지고 온다.
               int data = deleteList.get(deleteList.size()-1);
               result[data] = true;

               //다시 복구했기 때문에, 휴지통에서 복구하려는 값을 제거해준다.
               deleteList.remove(deleteList.size()-1);

               int [] deleteData = new int [data];
                //k위치까지 데이터 다 빼버린다.
                for(int j=0;j<data-1;j++){
                    deleteData[j] = currentList.pop();
                }
                currentList.push(data);
                for(int q =deleteData.length-1; q>=0; q--){
                    currentList.push(deleteData[q]);
                }
            }
        }

       StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<result.length;i++){
            if(result[i]==true){
                stringBuilder.append("O");
            }else{
                stringBuilder.append("X");
            }
        }

        return stringBuilder.toString();



    }

    public static class Cmd {
        public String cmdName;
        public int count;

        public Cmd(String cmd, int count) {
            this.cmdName = cmd;
            this.count = count;
        }

        public Cmd(String cmd) {
            this.cmdName = cmd;
        }

        public String getCmdName() {
            return cmdName;
        }


        public int getCount() {
            return count;
        }

    }

    public static ArrayList<Cmd> makeCmdList(String[] inputCmd){
        //수행할 명령어 들은 Map을 사용한다.
        ArrayList<Cmd> cmdList = new ArrayList<>();
        for(int i=0;i<inputCmd.length;i++){
            String [] data = inputCmd[i].split(" ");

            if(data.length==1){
                Cmd cmd = new Cmd(data[0]);
                cmdList.add(cmd);
            }else{
                Cmd cmd = new Cmd(data[0],Integer.parseInt(data[1]));
                cmdList.add(cmd);
            }
        }

        return cmdList;
    }
}
