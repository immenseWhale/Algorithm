class Solution {
    public boolean solution(int x) {
        // x를 문자열로 변환하여 자릿수 합을 계산
        String xStr = String.valueOf(x);
        int digitSum = 0;
        for (int i = 0; i < xStr.length(); i++) {
            digitSum += xStr.charAt(i) - '0';
        }

        // x가 자릿수 합으로 나누어지는지 확인
        if (x % digitSum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
