package pra.lv2.방문길이;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class answer_2 {

        public static void main(String[] args) {
            answer_2 ans = new answer_2();

            Scanner scan = new Scanner(System.in);
            String direction = scan.nextLine();

            int result = ans.solution(direction);
            System.out.println(result);
        }

        public int solution(String dirs) {
            char[] direction = dirs.toCharArray();
            int[][] gameBoard = new int[10][10];
            int[] currentLocation = {5, 5};
            int gameLength = 0;

            for (char location : direction) {
                int[] countLocation = getDirectionIfo(location);

                int newNum = currentLocation[0] + countLocation[0];
                int colNum = currentLocation[1] + countLocation[1];

                // 경계를 벗어나면 무시
                if (newNum < 0 || newNum >= 10 || colNum < 0 || colNum >= 10) {
                    continue;
                }

                // 새로운 위치 방문 여부 확인
                if (gameBoard[newNum][colNum] == 0) {
                    gameBoard[newNum][colNum] = 1;
                    gameLength += 1;
                }

                // 현재 위치 갱신
                currentLocation[0] = newNum;
                currentLocation[1] = colNum;
            }

            return gameLength;
        }

        public int[] getDirectionIfo(char dir) {
            Map<Character, int[]> directionInfo = new HashMap<>();

            final int[] U = {-1, 0};
            final int[] R = {0, 1};
            final int[] L = {0, -1};
            final int[] D = {1, 0};

            directionInfo.put('U', U);
            directionInfo.put('R', R);
            directionInfo.put('L', L);
            directionInfo.put('D', D);

            return directionInfo.get(dir);
        }
    }


