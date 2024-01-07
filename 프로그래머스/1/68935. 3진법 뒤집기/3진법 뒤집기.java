public class Solution {
    public int solution(int n) {
        String reversedTernary = reverseTernary(n);
        return Integer.parseInt(reversedTernary, 3);
    }

    private String reverseTernary(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            result.append(num % 3);
            num /= 3;
        }

        return result.toString();
    }
}
