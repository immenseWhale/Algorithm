class Solution {
    public int solution(int n) {
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        
        int sum = 0;
        for (char digit : digits) {
            sum += Character.getNumericValue(digit);
        }
        
        return sum;
    }
}
