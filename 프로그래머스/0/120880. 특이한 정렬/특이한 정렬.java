import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Pair[] pairs = new Pair[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            pairs[i] = new Pair(numlist[i], Math.abs(numlist[i] - n));
        }
        
        Arrays.sort(pairs);
        
        for (int i = 0; i < numlist.length; i++) {
            answer[i] = pairs[i].value;
        }
        
        return answer;
    }

    class Pair implements Comparable<Pair> {
        int value;
        int distance;
        
        Pair(int value, int distance) {
            this.value = value;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Pair other) {
            if (this.distance == other.distance) {
                return Integer.compare(other.value, this.value);
            }
            return Integer.compare(this.distance, other.distance);
        }
    }
}
