package pra.lv0.외계행성의나이;

public class solution {
    public String solution(int age) {

        String [] ageData = new String[26];

        //알파벳
        for(int i=0 ; i<26;i++){
            ageData[i] = String.valueOf((char)('a'+i));
        }

        String tAge = String.valueOf(age);
        StringBuilder result = new StringBuilder();

        for(char c : tAge.toCharArray()){
            int num = c-'0';
            result.append(ageData[num]);
        }

        return result.toString();
    }

    public String solutio2(int age) {
        String sAge = String.valueOf(age);
        //String sAge = Integer.toString(age);
        char [] ageList = new char[26];

        for(int i=0;i<26;i++){
            ageList[i] = (char)('a'+i);
        }

        StringBuilder result = new StringBuilder();

        for(int i=0;i<sAge.length();i++){
            int num = sAge.charAt(i)-'0';
            result.append(String.valueOf(ageList[num]));
        }

        return result.toString();
    }

    public String solution3(int age) {
        String sAge = Integer.toString(age);

        StringBuilder result = new StringBuilder();

        for(int i=0;i<sAge.length();i++){
            //char data = (char) ((sAge.charAt(i) -'0')+97);
            //char data =(char)(sAge.charAt(i) +49);
            char data = (char)('a'+(sAge.charAt(i) -'0'));
            result.append(data);
        }

        return result.toString();


    }
}
