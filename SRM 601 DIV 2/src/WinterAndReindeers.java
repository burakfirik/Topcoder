import java.util.*;
/*
*
* Burak Firik
*
* */


public class WinterAndReindeers {
    int[][]dp0 ;
    int[][]dp1;
    public int lcs(String a, String b, int[][]dp) {



        for (int i = 0; i <= a.length() ; i++) {
            for (int j = 0; j <= b.length(); j++) {

                if (i == 0 || j == 0) {
                    continue;
                }

                if (a.charAt(i- 1) == b.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j - 1]);
                }

                dp[i][j] = Math.max(dp[i][j], Math.max(dp[i -1][j], dp[i][j - 1]));

            }
        }
        return dp[a.length()][b.length()];

    }

	public int getNumber(String[] allA, String[] allB, String[] allC) {

        String A = "";
        String B = "";
        String C = "";

        for (String s : allC) {
            C += s;
        }

        for (String s : allA) {
            A += s;
        }
        for (String s : allB) {
            B += s;
        }

        if (A.length() > B.length()) {
            String t = B;
            B = A;
            A = t;
        }


        dp0 = new int[A.length() + 1][B.length() + 1];
        dp1 = new int[A.length() + 1][B.length() + 1];
        lcs(A, B, dp0);

        lcs(new StringBuilder(A).reverse().toString(), new StringBuilder(B).reverse().toString(), dp1);

        int[] aEnd = new int[A.length()];
        int[] bEnd = new int[B.length()];
        Arrays.fill(aEnd, -1);
        Arrays.fill(bEnd, -1);
        for (int i = 0; i < A.length(); i++) {

            int start = i;
            int k = 0;
            while (start < A.length()) {
                if (A.charAt(start) == C.charAt(k)) {
                    k++;
                }
                if (k == C.length()) {
                    aEnd[i] = start;
                    break;
                }
                start++;
            }
        }

        for (int i = 0; i < B.length(); i++) {
            int start = i;
            int k = 0;
            while (start < B.length()) {
                if (B.charAt(start) == C.charAt(k)) {
                    k++;
                }
                if (k == C.length()) {
                    bEnd[i] = start;
                    break;
                }
                start++;
            }
        }

        int count = 0;
        for (int i = 0; i < A.length() ; i++) {
            for (int j = 0; j < B.length(); j++) {
                if (aEnd[i] != -1 && bEnd[j] != -1) {
                    count = Math.max(count, C.length() + dp0[i][j] + dp1[A.length() - aEnd[i] -1 ][B.length() - bEnd[j] -1]);
                }
            }
        }
        return count;
	}
}
