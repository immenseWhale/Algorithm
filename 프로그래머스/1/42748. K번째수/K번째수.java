import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 결과를 담을 배열 선언
        int[] answer = new int[commands.length];

        // 각각의 command에 대해 반복
        for (int i = 0; i < commands.length; i++) {
            // 현재 command 가져오기
            int[] cmd = commands[i];

            // 배열을 자르기
            int[] slicedArray = Arrays.copyOfRange(array, cmd[0] - 1, cmd[1]);

            // 자른 배열을 정렬
            Arrays.sort(slicedArray);

            // 정렬된 배열에서 k번째 수를 결과 배열에 저장
            answer[i] = slicedArray[cmd[2] - 1];
        }

        // 최종 결과 배열 반환
        return answer;
    }
}
