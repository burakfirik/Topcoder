import java.util.*;
/*
*
* Burak Firik
*
* */


public class WinterAndMandarins {
	
	public int getNumber(int[] bags, int K) {

        Arrays.sort(bags);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= bags.length - K; i++) {
            int first = bags[K + i - 1] - bags[i];
            min = Math.min(min, first);

        }


		return min;
	}
}
