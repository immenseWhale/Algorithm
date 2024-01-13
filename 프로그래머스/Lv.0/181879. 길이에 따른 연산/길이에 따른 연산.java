public class Solution {
    public int solution(int[] num_list) {
        int answer;
        int numLength = num_list.length;

        if (numLength > 10) {
            answer = 0;
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}
