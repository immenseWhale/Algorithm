import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> result = new ArrayList<>();
        
        for (String str : strArr) {
            if (!str.contains("ad")) {
                result.add(str);
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
}
