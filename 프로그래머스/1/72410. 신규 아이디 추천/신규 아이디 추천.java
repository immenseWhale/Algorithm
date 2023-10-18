class Solution {
    public String solution(String new_id) {
        // 1. 대문자를 소문자로 변환
        new_id = new_id.toLowerCase();

        // 2. 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3. 연속된 마침표를 하나로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");

        // 4. 처음과 끝의 마침표 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");

        // 5. 빈 문자열이면 "a" 대입
        if (new_id.isEmpty()) {
            new_id = "a";
        }

        // 6. 길이가 16 이상이면, 첫 15개의 문자만 남기고 나머지 제거
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }

        // 7. 길이가 2 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        while (new_id.length() <= 2) {
            new_id = new_id + new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}
