class Solution {
    public int solution(int n, int t) {
        int bacteriaCount = n;

        for (int i = 0; i < t; i++) {
            bacteriaCount *= 2;
        }

        return bacteriaCount;
    }
}
