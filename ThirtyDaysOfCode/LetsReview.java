package ThirtyDaysOfCode;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = in.next();
        }

            for (int i = 0; i < n; i++) {
                char[] charStr = strArr[i].toCharArray();
                for (int j = 0; j < strArr[i].length(); j++) {
                    if (j % 2 == 0) {
                        System.out.print(charStr[j]);
                    }
                }
                System.out.print(" ");
                for (int j = 0; j < strArr[i].length(); j++) {
                    if (j % 2 == 1) {
                        System.out.print(charStr[j]);
                    }
                }
                System.out.println();
            }
        }
    }

