class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int nLength = number.length;

        for (int i = 0; i < nLength - 2; i++) {
            for (int j = i + 1; j < nLength - 1; j++) {
                for (int k = j + 1; k < nLength; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
