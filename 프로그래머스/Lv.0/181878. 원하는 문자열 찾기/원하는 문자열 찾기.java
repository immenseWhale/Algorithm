public class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        int len1 = myString.length();
        int len2 = pat.length();

        for (int i = 0; i <= len1 - len2; i++) {
            if (myString.substring(i, i + len2).equals(pat)) {
                return 1;
            }
        }

        return 0; // 일치하는 부분이 없으면 0 반환
    }
}
