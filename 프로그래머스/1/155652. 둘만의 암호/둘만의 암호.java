import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder(); // 결과 문자열을 저장할 StringBuilder 선언

        for (int i = 0; i < s.length(); i++) { // 문자열 s의 각 문자에 대해 반복
            char returnChar = s.charAt(i); // 현재 문자를 가져옴

            for (int j = 0; j < index; j++) { // 주어진 index만큼 반복하여 문자를 변환
                // 'z'를 넘어가는 경우 처리
                if (returnChar + 1 > 'z') {
                    returnChar = 'a';
                } else {
                    returnChar++;
                }

                // skip 문자열에 포함된 경우 처리
                while (skip.contains(String.valueOf(returnChar))) {
                    if (returnChar + 1 > 'z') {
                        returnChar = 'a';
                    } else {
                        returnChar++;
                    }
                }
            }
            
            answer.append(returnChar); // 변환된 문자를 결과 문자열에 추가
        }
        
        return answer.toString(); // 결과 문자열을 문자열로 변환하여 반환
    }
}
