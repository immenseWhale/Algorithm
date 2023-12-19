class Solution {
    public String[] solution(String[] str_list) {
        int lIndex = -1;
        int rIndex = -1;

        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i]) && lIndex == -1) {
                lIndex = i;
            } else if ("r".equals(str_list[i]) && rIndex == -1) {
                rIndex = i;
            }
        }

        if (lIndex == -1 && rIndex == -1) {
            return new String[]{}; // "l"과 "r"이 없는 경우
        } else if (lIndex != -1 && (rIndex == -1 || lIndex < rIndex)) {
            return getLeftList(str_list, lIndex);
        } else {
            return getRightList(str_list, rIndex);
        }
    }

    private String[] getLeftList(String[] str_list, int lIndex) {
        String[] leftList = new String[lIndex];
        System.arraycopy(str_list, 0, leftList, 0, lIndex);
        return leftList;
    }

    private String[] getRightList(String[] str_list, int rIndex) {
        String[] rightList = new String[str_list.length - rIndex - 1];
        System.arraycopy(str_list, rIndex + 1, rightList, 0, rightList.length);
        return rightList;
    }
}
