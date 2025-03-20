package pra.lv3.베스트앨범;

import java.util.HashMap;
import java.util.List;

public class answer_1 {
    public static void main(String[] args) {

    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<Integer,Integer> songList = new HashMap<>();
        HashMap<String,List<Integer>> resultList = new HashMap<>();


        for(int i=0;i<genres.length;i++){
            songList.put(i,plays[i]);
        }



        for(int i=0;i<genres.length;i++){
            if(!resultList.containsKey(genres[i])){
                List<Integer> currentList = resultList.get(genres[i]);
                currentList.add(i);
                resultList.put(genres[i],currentList);
            }else{
                if(resultList.get(genres[i]).size()==1){
                    List<Integer> validSongList = resultList.get(genres[i]);
                    int currentData = validSongList.get(0);

                    if(plays[i]==plays[currentData]){
                        if(i>currentData){
                            validSongList.add(0,currentData);
                            validSongList.add(1,i);
                        }
                        validSongList.add(0,i);
                        validSongList.add(1,currentData);
                    }
                    else if(plays[i]>plays[currentData]){
                        validSongList.add(0,i);
                        validSongList.add(1,currentData);
                    }
                    continue;
                }

                int currentSongValue = plays[i];
                List<Integer> currentSongList = resultList.get(genres[i]);

                if(plays[currentSongList.get(0)]<currentSongValue){
                        currentSongList.add(0,i);
                        currentSongList.add(1,currentSongList.get(0));
                }else if(plays[currentSongList.get(1)]<currentSongValue) {
                    currentSongList.add(1, i);
                }

            }
        }

        int[] answer = {};
        return answer;
    }

}
