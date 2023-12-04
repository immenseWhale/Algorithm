class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        // my_string의 길이가 is_suffix의 길이보다 짧으면 접미사가 될 수 없음
        if (my_string.length() >= is_suffix.length()) {
            // 주어진 문자열에서 is_suffix 길이만큼의 접미사를 추출하여 비교
            String suffixCandidate = my_string.substring(my_string.length() - is_suffix.length());

            // 추출한 접미사와 is_suffix가 일치하면 1, 아니면 0을 반환
            if (suffixCandidate.equals(is_suffix)) {
                answer = 1;
            }
        }

        return answer;
    }
}
