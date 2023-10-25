class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] lastPosition = new int[26]; // 26개의 영어 소문자에 대한 마지막 위치 저장

        for (int i = 0; i < 26; i++) {
            lastPosition[i] = -1; // 모든 문자의 마지막 위치를 초기화
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentCharIndex = currentChar - 'a';

            if (lastPosition[currentCharIndex] != -1) {
                answer[i] = i - lastPosition[currentCharIndex];
            } else {
                answer[i] = -1;
            }

            lastPosition[currentCharIndex] = i;
        }

        return answer;
    }

}