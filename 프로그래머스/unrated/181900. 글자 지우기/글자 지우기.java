class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!contains(indices, i)) {
                result.append(my_string.charAt(i));
            }
        }

        return result.toString();
    }

    private boolean contains(int[] indices, int index) {
        for (int i : indices) {
            if (i == index) {
                return true;
            }
        }
        return false;
    }
}
