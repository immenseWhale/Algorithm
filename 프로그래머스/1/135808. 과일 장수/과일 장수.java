import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 점수를 정렬

        // 가장 높은 점수부터 시작하여 상자에 담기
        for (int i = score.length; i >= m; i -= m) {
            // 현재 점수로 상자를 채우고, 상자 개수만큼 점수를 더한다
            answer += m * score[i - m];
        }

        return answer;
    }
}
