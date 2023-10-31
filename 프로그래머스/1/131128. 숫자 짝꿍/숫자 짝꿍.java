class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        // X와 Y에서 각 숫자의 등장 횟수를 센다.
        for (char ch : X.toCharArray()) {
            xCount[ch - '0']++;
        }
        for (char ch : Y.toCharArray()) {
            yCount[ch - '0']++;
        }
        
        // 두 숫자에서 공통으로 나타나는 숫자 중 가장 큰 숫자부터 짝꿍을 만든다.
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }
        
        if(answer.length()==0){
            return "-1";
        }
        if(answer.charAt(0)=='0'){
            return "0";
        }
        
        return answer.toString();
    }
}
