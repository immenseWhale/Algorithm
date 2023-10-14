import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxKinds = nums.length / 2; // 최대로 선택할 수 있는 종류 수
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        return Math.min(set.size(), maxKinds);
    }
}
