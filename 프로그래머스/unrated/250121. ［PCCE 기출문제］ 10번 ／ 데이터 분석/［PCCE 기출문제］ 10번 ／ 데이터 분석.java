import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // ext 값이 val_ext보다 작은 데이터만 필터링
        List<int[]> filteredData = new ArrayList<>();
        for (int[] d : data) {
            int index = getIndexByExt(ext);
            if (index != -1 && d[index] < val_ext) {
                filteredData.add(d);
            }
        }

        // sort_by를 기준으로 오름차순 정렬
        filteredData.sort(Comparator.comparingInt(d -> {
            int index = getIndexByExt(sort_by);
            return index != -1 ? d[index] : 0;
        }));

        // List를 배열로 변환
        int[][] result = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            result[i] = filteredData.get(i);
        }

        return result;
    }

    private static int getIndexByExt(String ext) {
        switch (ext) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        // 예시 데이터
        int[][] data = {
            {1, 20300104, 100, 80},
            {2, 20300804, 847, 37},
            {3, 20300401, 10, 8}
        };

        // 테스트
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        int[][] result = solution(data, ext, val_ext, sort_by);

        // 결과 출력
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
