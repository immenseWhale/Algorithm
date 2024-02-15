import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        
        for (String word : dic) {
            if (containsAllCharacters(word, spell)) {
                return 1; 
            }
        }
        
        return 2; 
    }
    private boolean containsAllCharacters(String word, String[] chars) {
        for (String c : chars) {
            if (!word.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
