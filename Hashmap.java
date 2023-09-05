import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 4, 5 };
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
