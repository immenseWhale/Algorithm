class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder tail = new StringBuilder();
        for (String str : str_list) { 
            if (!str.contains(ex)) { 
                tail.append(str);
            }
        }
        return tail.toString(); 
    }
}
