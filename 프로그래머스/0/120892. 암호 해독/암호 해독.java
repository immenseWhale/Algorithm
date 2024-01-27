class Solution {
    public String solution(String cipher, int code) {
        StringBuilder decoded = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            char encryptedChar = cipher.charAt(i);
            char decryptedChar;

            if (encryptedChar == ' ') {
                decryptedChar = ' ';
            } else {
                decryptedChar = (char) ((encryptedChar - 'a' + 26) % 26 + 'a');
            }

            decoded.append(decryptedChar);
        }

        return decoded.toString();
    }
}
