class Solution {
    public int[] solution(int[] array) {
        int maxValue = array[0];
        int maxIndex = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        
        return new int[]{maxValue, maxIndex};
    }
}
