class Solution {
    public String solution(String[] seoul) {
        int index = findKim(seoul);
        return "김서방은 " + index + "에 있다";
    }

    private int findKim(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                return i;
            }
        }
        return -1; 
    }
}
