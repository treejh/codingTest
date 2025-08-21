class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            // 큰 값을 가로, 작은 값을 세로로
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }
}