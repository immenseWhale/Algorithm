import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerPosition = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPosition.put(players[i], i);
        }
        
        for (String calling : callings) {
            int position = playerPosition.get(calling);
            if (position > 0) { // 첫 번째 선수를 제외한 선수만 위치를 바꿉니다.
                // 선수 위치 스왑
                String temp = players[position];
                players[position] = players[position - 1];
                players[position - 1] = temp;
                
                // HashMap 업데이트
                playerPosition.put(players[position], position);
                playerPosition.put(players[position - 1], position - 1);
            }
        }
        return players;
    }
}
