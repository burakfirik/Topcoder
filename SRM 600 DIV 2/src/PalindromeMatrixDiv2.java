
import java.util.*;



public class PalindromeMatrixDiv2 {
	class Node{
        int i;
        int j;
        public Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
	public int minChange(String[] A, int rowCount, int columnCount) {
        int minCount = Integer.MAX_VALUE;
        int [] pcol = new int[A[0].length()];
        // 1 2 3 4 5
        int n = A.length;
        int m = A[0].length();
        for (int i = pcol.length - columnCount; i < pcol.length; i++) {
            pcol[i] = 1;
        }
        do {
            int[] prow = new int[A.length];
            for (int i = prow.length - rowCount; i < prow.length ; i++) {
                prow[i] = 1;
            }

            do{
                boolean[][] visited = new boolean[A.length ][A[0].length()];
                int count = 0;

                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A[0].length(); j++) {
                        int numberZero = 0;
                        int numberOne = 0;
                        if (!visited[i][j]) {
                            Stack<Node> stack = new Stack<>();
                            stack.push(new Node(i, j));

                            while (!stack.isEmpty()) {
                                Node visiting = stack.pop();



                                if (!visited[visiting.i][visiting.j]) {
                                    if (A[visiting.i].charAt(visiting.j) == '1') {
                                        numberOne++;
                                    } else {
                                        numberZero++;
                                    }
                                    if (prow[visiting.i] == 1) {
                                        stack.push(new Node(visiting.i, m - visiting.j - 1 ));
                                    }

                                    if (pcol[visiting.j] == 1) {
                                        stack.push(new Node(n - visiting.i - 1, visiting.j ));
                                    }

                                }
                                visited[visiting.i][visiting.j] = true;
                            }
                        }

                        count += Math.min(numberOne, numberZero);
                    }
                }
                minCount = Math.min(minCount, count);
            } while (nextPermutation(prow));

        } while (nextPermutation(pcol));



        return minCount;
	}

    public boolean nextPermutation(int[] num) {
        // 0 0 1 1
        int p = num.length - 1;

        for (; p > 0 && num[p - 1] >= num[p]; p-- );

        if (p == 0) {
            return false;
        }

        int q = num.length - 1;

        for (; q > p - 1 && num[q] <= num[p - 1]; q--);

        swap(num, p - 1 , q);

        int l = p;
        int r = num.length - 1;

        while (l < r) {
            swap(num, l , r);
            r--;
            l++;
        }
        return true;
    }

    public void swap(int[] num, int l, int r) {
        int temp = num[l];
        num[l] = num[r];
        num[r] = temp;
    }
}
