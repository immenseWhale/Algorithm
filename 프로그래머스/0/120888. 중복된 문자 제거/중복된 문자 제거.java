class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[128];

        for (char ch : my_string.toCharArray()) {
            if (!visited[ch]) {
                result.append(ch);
                visited[ch] = true;
            }
        }

        return result.toString();
    }
}
