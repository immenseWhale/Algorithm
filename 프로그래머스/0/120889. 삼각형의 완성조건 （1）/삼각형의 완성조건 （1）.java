class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        int maxSide = Math.max(Math.max(a, b), c);

        int sumOfOtherSides = (a + b + c) - maxSide;
        if (maxSide < sumOfOtherSides) {
            return 1;
        } else {
            return 2;
        }
    }
}
