import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 가로(n), 세로(m) 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 세로 길이 만큼 반복
        for (int i = 0; i < m; i++) {
            // 가로 길이 만큼 별 출력
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        // 스캐너 닫기
        scanner.close();
    }
}
