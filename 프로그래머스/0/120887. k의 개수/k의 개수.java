class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            answer += countOccurrences(num, k);
        }

        return answer;
    }

    private int countOccurrences(int number, int target) {
        int count = 0;

        while (number > 0) {
            if (number % 10 == target) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}
