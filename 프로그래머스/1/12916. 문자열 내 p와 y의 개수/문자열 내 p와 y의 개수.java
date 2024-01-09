public class Solution {
    public boolean solution(String s) {
        return s.toLowerCase().chars().filter(ch -> ch == 'p').count() == s.toLowerCase().chars().filter(ch -> ch == 'y').count();
    }
}
