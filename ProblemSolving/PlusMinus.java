package ProblemSolving;

import java.util.*;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println((double) positive / n);
        System.out.println((double) negative / n);
        System.out.println((double) zero / n);

    }

}

