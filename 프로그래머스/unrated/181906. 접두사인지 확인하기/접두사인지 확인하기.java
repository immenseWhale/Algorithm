class Solution {
    public int solution(String my_string, String is_prefix) {
        // is_prefix가 my_string의 접두사인지 확인
        if (my_string.startsWith(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
