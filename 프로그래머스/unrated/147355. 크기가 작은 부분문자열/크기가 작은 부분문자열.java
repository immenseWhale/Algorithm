class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        
        // p의 길이에 따라서 int 또는 long으로 변환
        boolean useLong = (pLength >= 10); // 예시 길이는 조절 가능
        
        long pNum = useLong ? Long.parseLong(p) : Integer.parseInt(p); // p를 int 또는 long으로 변환

        // t 문자열에서 p와 같은 길이의 부분문자열을 잘라내어 확인
        if (tLength >= pLength) {
            for (int i = 0; i <= tLength - pLength; i++) {
                String subStr = t.substring(i, i + pLength);
                long subNum = useLong ? Long.parseLong(subStr) : Integer.parseInt(subStr); // 부분 문자열을 int 또는 long으로 변환
                
                if (subNum <= pNum) {
                    answer++;
                }   
            }
        }
        
        return answer;
    }
}
