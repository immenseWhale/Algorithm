import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxHorizontal = 0;  // 명함을 가로로 두었을 때의 최대 길이
        int maxVertical = 0;    // 명함을 세로로 두었을 때의 최대 길이

        for (int[] size : sizes) {
            int a = size[0];  // 가로 길이
            int b = size[1];  // 세로 길이

            // 명함을 가로로 둔 경우
            maxHorizontal = Math.max(maxHorizontal, Math.max(a, b));

            // 명함을 세로로 둔 경우
            maxVertical = Math.max(maxVertical, Math.min(a, b));
        }

        // 지갑의 크기 계산
        int answer = maxHorizontal * maxVertical;
        return answer;
    }
}
