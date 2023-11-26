import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            result.add(i);
        }

        // List를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    
    }
}