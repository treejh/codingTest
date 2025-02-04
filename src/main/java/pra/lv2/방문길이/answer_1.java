package pra.lv2.방문길이;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class answer_1 {


    public static void main(String[] args) {
        answer_1 ans = new answer_1();

        System.out.println();

        Scanner scan = new Scanner(System.in);
        String direction = scan.nextLine();
        ans.solution(direction);
        System.out.println(ans.solution(direction));
    }

    private static final HashMap<Character, int[]> direction = new HashMap<>();

    public int solution(String dirs) {
        setDirectionIfo();
        char[] playerDirection = dirs.toCharArray();
        int x = 5;
        int y = 5;
        HashSet<int[]> gameLength = new HashSet<>();

        for (char location : playerDirection) {
            int offset[] = direction.get(location);
            int nx = x + offset[0];
            int ny = y + offset[1];

            if (validArea(nx, ny)) {
                continue;
            }

            gameLength.add(new int[]{x, y, nx, ny});
            gameLength.add(new int[]{nx, ny, x, y});

            x = nx;
            y = ny;

        }

        return gameLength.size() / 2;


    }

    private void setDirectionIfo() {
        direction.put('U', new int[]{-1, 0});
        direction.put('D', new int[]{1, 0});
        direction.put('R', new int[]{0, 1});
        direction.put('L', new int[]{0, -1});
    }

    private boolean validArea(int x, int y) {
        if (x < 0 || x > 10 || y < 0 || y > 10) {
            return true;
        }
        return false;
    }

}
