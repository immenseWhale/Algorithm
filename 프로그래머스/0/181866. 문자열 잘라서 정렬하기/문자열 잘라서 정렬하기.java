import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] stringArray = myString.split("x");
        Arrays.sort(stringArray);

        return Arrays.stream(stringArray)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
    }
}
