class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;

        for (int i = 1; i <= count; i++) {
            totalCost += price * i;
        }

        long answer = (totalCost <= money) ? 0 : totalCost - money;
        return answer;
    }
}
