class Solution {
    public int solution(int[] common) {
        int lastElement = common[common.length - 1];
        
        if (common[1] - common[0] == common[2] - common[1]) {
            // 등차수열
            return lastElement + (common[1] - common[0]);
        } else {
            // 등비수열
            return (int) (lastElement * 1.0 * common[1] / common[0]);
        }
    }
}
