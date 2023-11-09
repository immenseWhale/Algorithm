import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // 영단어와 숫자를 매핑하는 HashMap 생성
        HashMap<String, Integer> wordChange = new HashMap<>();
        wordChange.put("zero", 0);
        wordChange.put("one", 1);
        wordChange.put("two", 2);
        wordChange.put("three", 3);
        wordChange.put("four", 4);
        wordChange.put("five", 5);
        wordChange.put("six", 6);
        wordChange.put("seven", 7);
        wordChange.put("eight", 8);
        wordChange.put("nine", 9);

        // 문자열을 순회하면서 숫자를 찾아 answer에 누적
        StringBuilder currentWord = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                answer = answer * 10 + (ch - '0');
            } else {
                currentWord.append(ch);
                if (wordChange.containsKey(currentWord.toString())) {
                    answer = answer * 10 + wordChange.get(currentWord.toString());
                    currentWord.setLength(0);  // currentWord 초기화
                }
            }
        }

        return answer;
    }
}
