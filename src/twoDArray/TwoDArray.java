package twoDArray;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {

    public static int hourglassSum(List<List<Integer>> arr) {
        List<List<Integer>> testResults = new ArrayList<>();
        for (List<Integer> line : arr) {
            List<Integer> testLine = new ArrayList<>();
            for (int value : line) {
                while (testLine.size() < 3) {
                    testLine.add(value);
                }
            }
        }
        return 0;
    }
}
