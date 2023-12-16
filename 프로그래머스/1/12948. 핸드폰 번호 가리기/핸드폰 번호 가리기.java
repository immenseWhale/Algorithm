class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String lastNum4 = phone_number.substring(phone_number.length() - 4);
        int hideLength = phone_number.length() - 4;
        for (int i = 0; i < hideLength; i++) {
            answer += "*";
        }

        answer += lastNum4;

        return answer;
    }
}
