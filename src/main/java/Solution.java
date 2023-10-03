import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
            total += count -1;
        }

        return  total;
    }

}
