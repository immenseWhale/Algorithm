import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] found = new boolean[10]; // 0부터 9까지의 숫자가 발견되었는지 표시하는 배열

        // numbers 배열에 있는 숫자를 표시
        for (int num : numbers) {
            found[num] = true;
        }

        // 0부터 9까지의 숫자 중, 발견되지 않은 숫자를 찾아서 더함
        for (int i = 0; i <= 9; i++) {
            if (!found[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
