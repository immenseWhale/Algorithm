import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] aAnswer = {1, 2, 3, 4, 5};
        int[] bAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        
        // 각 수포자의 패턴을 이용하여 정답을 체크합니다.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == aAnswer[i % aAnswer.length]) {
                scores[0]++;
            }
            if (answers[i] == bAnswer[i % bAnswer.length]) {
                scores[1]++;
            }
            if (answers[i] == cAnswer[i % cAnswer.length]) {
                scores[2]++;
            }
        }
        
        // 최고 점수를 구합니다.
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> list = new ArrayList<>();
        
        // 최고 점수를 가진 수포자를 찾아 리스트에 추가합니다.
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1); // 1부터 시작하도록 인덱스에 1을 더합니다.
            }
        }
        
        answer = new int[list.size()];
        
        // 리스트를 배열로 변환합니다.
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
