class Solution {
    public String solution(String polynomial) {
        String[] list = polynomial.split("\\+");
        int x = 0;
        int remain = 0;

        for (int i = 0; i < list.length; i++) {
            String data = list[i].trim();

            if (data.contains("x")) {
                String xData = data.replace("x", "").trim();
                if (xData.equals("")) {
                    x += 1;
                } else {
                    x += Integer.valueOf(xData);
                }
            } else {
                remain += Integer.valueOf(data);
            }
        }

        StringBuilder answer = new StringBuilder();

        // 둘 다 0이면 "0"
        if (x == 0 && remain == 0) {
            return "0";
        }

        // x항 추가
        if (x > 0) {
            if (x == 1) {
                answer.append("x");
            } else {
                answer.append(x).append("x");
            }
        }

        // 상수항 추가
        if (remain > 0) {
            if (x > 0) answer.append(" + ");
            answer.append(remain);
        }

        return answer.toString();
    }
}
