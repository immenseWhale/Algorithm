import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        Arrays.sort(section); // 구역 번호를 정렬
        
        int start = section[0]; // 첫 번째 구역을 시작점으로 초기화
        int end = start + (m - 1); // 시작점에서 롤러 길이를 더한 값을 끝점으로 초기화
        int answer = 1; // 최소 페인트칠 횟수를 저장하는 변수
        
        for (int i = 1; i < section.length; i++) {
            int current = section[i]; // 현재 구역
            
            if (current > end) { // 현재 구역이 현재 롤러로 처리할 수 없는 경우
                start = current; // 시작점을 현재 구역으로 업데이트
                end = start + (m - 1); // 끝점도 업데이트
                answer++; // 페인트칠 횟수 증가
            }
        }
        
        return answer;
    }
}
