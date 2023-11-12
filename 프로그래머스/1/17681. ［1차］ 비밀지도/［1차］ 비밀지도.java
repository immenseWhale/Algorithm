class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // OR 연산을 이용하여 두 배열의 각 원소를 합침
            int combined = arr1[i] | arr2[i];
            
            // 이진수로 변환하고 비밀지도의 한 행을 구성
            String row = Integer.toBinaryString(combined);
            
            // 만약 이진수의 길이가 n보다 작다면 앞에 0을 채워줌
            while (row.length() < n) {
                row = "0" + row;
            }

            // 문자열을 구성하면서 1인 부분은 '#'으로, 0인 부분은 ' '으로 표현
            StringBuilder resultRow = new StringBuilder();
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    resultRow.append("#");
                } else {
                    resultRow.append(" ");
                }
            }

            // 완성된 문자열을 결과 배열에 저장
            answer[i] = resultRow.toString();
        }

        return answer;
    }
}
