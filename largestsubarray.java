import java.util.HashMap;
import java.util.Map;

public class largestsubarray {
    public static void main(String args[]) {
        int arr[] = new int[] { 15, 2, -2, -8, 1, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                ans = i + 1;
            }
            if (map.get(sum) != null) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(ans);
    }
}
