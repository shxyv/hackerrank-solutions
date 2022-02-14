package ProblemSolving;
import java.util.*;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int difference;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.size() - i - 1);
        }
        difference = sum1 - sum2;
        return Math.abs(difference);

    }
}

