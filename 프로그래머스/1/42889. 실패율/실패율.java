import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        List<Stage> stageList = new ArrayList<>();

        // 각 스테이지별로 실패율을 계산하고 Stage 객체로 리스트에 저장
        for (int i = 1; i <= N; i++) {
            int totalPlayers = 0; // 스테이지에 도달한 플레이어 수
            int notClearedPlayers = 0; // 스테이지를 클리어하지 못한 플레이어 수

            // 모든 플레이어에 대해 스테이지 도달 여부와 클리어 여부를 확인
            for (int stage : stages) {
                if (stage >= i) {
                    totalPlayers++; // 스테이지에 도달한 플레이어 수 증가
                }

                if (stage == i) {
                    notClearedPlayers++; // 스테이지를 클리어하지 못한 플레이어 수 증가
                }
            }

            // 실패율 계산, 분모(totalPlayers)가 0인 경우 0으로 설정
            double failureRate = (totalPlayers == 0) ? 0 : (double) notClearedPlayers / totalPlayers;
            
            // Stage 객체 생성 및 리스트에 추가
            stageList.add(new Stage(i, failureRate));
        }

        // 실패율을 기준으로 스테이지 리스트를 내림차순으로 정렬
        Collections.sort(stageList);

        // 정렬된 스테이지 번호를 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).stageNumber;
        }

        return answer;
    }
}

class Stage implements Comparable<Stage> {
    int stageNumber; // 스테이지 번호
    double failureRate; // 실패율

    public Stage(int stageNumber, double failureRate) {
        this.stageNumber = stageNumber;
        this.failureRate = failureRate;
    }

    @Override
    public int compareTo(Stage other) {
        // 실패율을 기준으로 정렬, 실패율이 같으면 스테이지 번호로 정렬
        if (this.failureRate > other.failureRate) {
            return -1;
        } else if (this.failureRate < other.failureRate) {
            return 1;
        } else {
            return Integer.compare(this.stageNumber, other.stageNumber);
        }
    }
}
