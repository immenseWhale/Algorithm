import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minIndex = findMinIndex(arr);

        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }

    private int findMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
