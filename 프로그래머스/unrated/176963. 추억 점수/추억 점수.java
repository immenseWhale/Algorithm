import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 맵에 이름과 점수 매칭
        Map<String, Integer> people = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            people.put(name[i], yearning[i]);
        }
        
        // 각 사진별로 그리움 점수 합산
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            for(String person : photo[i]) {
                // 맵에서 사람 이름에 해당하는 그리움 점수를 찾아 합산
                // 이름이 맵에 없으면 getOrDefault 메서드가 0을 반환
                sum += people.getOrDefault(person, 0);
            }
            answer[i] = sum; // 합산된 점수를 answer 배열에 저장
        }
        
        return answer;
    }
}
