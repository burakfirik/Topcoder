import java.util.*;
/*
*
* Burak Firik
*
* */
public class WinterAndCandies {
	
	public int getNumber(int[] type) {
        int answer = 0;
        Arrays.sort(type);
            for (int len = 1; len <= type.length; len++) {
                Map<Integer, Integer> map = new HashMap<>();
                int end = 0;

                while (end < type.length && type[end] <= len) {
                    if (!map.containsKey(type[end])) {
                        map.put(type[end], 0);
                    }
                    map.put(type[end], map.get(type[end])+ 1);
                    end++;
                }
                int count = 1;
                for (int j = 1; j <= len ; j++) {
                    if (!map.containsKey(j)) {
                        count = 0;
                        break;
                    } else {
                        count *= map.get(j);
                    }
                }
                answer += count;

            }
        return answer;
	}
}
