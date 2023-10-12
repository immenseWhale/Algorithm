class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newColas = n / a * b; // 빈 병으로 얻는 콜라의 수
            answer += newColas; // 새로 얻은 콜라를 정답에 추가
            n = newColas + (n % a); // 남은 빈 병 갱신
        }

        return answer;
    }
}
