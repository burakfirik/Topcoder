import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import java.util.*;


public class ORSolitaireDiv2 {
	
	public int getMinimum(int[] numbers, int goal) {

        List<Integer> nums = new ArrayList<>();

        for (int i : numbers) {
            if ((goal | i) == goal) {
                nums.add(i);
            }
        }

        int max = (1 << nums.size()) - 1;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= max; i++) {
            int bit = 0;
            int check = 0;
            for (int j = 0; j < nums.size(); j++) {

                if (((i >> j) & 0x1) == 1) {
                    bit++;
                } else {
                    check |= nums.get(j);
                }
            }

            if (check != goal) {
               min = Math.min(min, bit);
            }

        }


        return min == Integer.MAX_VALUE ? 0 : min;
	}
}
