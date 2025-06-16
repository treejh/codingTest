package pra.lv0.모스부호1;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        Map<String, Character> morseData = new HashMap<>();
        String [] answerLetter = letter.split(" ");
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."
        };

        //morseData에 모스 부호 저장
        for(int i=0;i<morse.length;i++){
            morseData.put(morse[i],(char)(i+'a'));
        }

        for(int i=0;i<answerLetter.length;i++){
            char data = morseData.get(answerLetter[i]);
            answer.append(data);

        }
        return answer.toString();
    }

    public String solution2(String letter) {
        Map<String, String> morseData = new HashMap<>();
        StringBuilder result = new StringBuilder();

        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
                + "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
                + "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
                + "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
                + "'-.--':'y','--..':'z'";

        String [] splitMorse = morse.split(",");
        String [] letterData = letter.split(" ");

        for(int i=0;i<splitMorse.length;i++){
            String data = splitMorse[i].replace("'","");
            int index = data.indexOf(":");
            morseData.put(data.substring(0,index),data.substring(index+1));
        }

        for(int i=0; i< letterData.length;i++){
            String data = morseData.get(letterData[i]);
            result.append(data);
        }

        return result.toString();

    }



}
