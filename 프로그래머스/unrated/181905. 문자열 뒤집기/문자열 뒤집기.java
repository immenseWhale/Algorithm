class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();

        for (int i = s, j = e; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }
}
