import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import java.util.*;


public class TheShuttles {
	
	public int getLeastCost(int[] cnt, int baseCost, int seatCost) {

        int max = 0;

        for (int seat : cnt) {
            max = Math.max(max, seat);
        }
        int minCost = Integer.MAX_VALUE;
        for (int i = 1; i <= max ; i++) {
            int cost = 0;
            for (int j = 0; j < cnt.length; j++) {
                cost += baseCost * Math.ceil(cnt[j]/(i*1.0)) + Math.ceil(cnt[j]/(i * 1.0)) * i * seatCost;
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
	}
}
