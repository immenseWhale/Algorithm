class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        
        for(String s : goal){
            // cards1에서 단어를 사용할 수 있는 경우
            if (index1 < cards1.length && cards1[index1].equals(s)) {
                index1++;  // 다음 단어로 넘어감            
            
            // cards2에서 단어를 사용할 수 있는 경우
            } else if (index2 < cards2.length && cards2[index2].equals(s)) {
                index2++;  // 다음 단어로 넘어감
                
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}