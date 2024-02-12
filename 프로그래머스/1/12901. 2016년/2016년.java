class Solution {
    public String solution(int a, int b) {
        int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int totalDays = 0;
        for (int i = 1; i < a; i++) {
            totalDays += daysOfMonth[i];
        }
        totalDays += b - 1; 
        String answer = daysOfWeek[totalDays % 7];        
        return answer;
    }
}
