import java.util.Stack;

public class NGE {

    public static void main(String args[]) {
        int arr[] = new int[] { 14, 16, 9, 90, 99, 2, 6, 19, 4 };
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (s.size() == 0) {
                ans[i] = -1;

            } else if (s.size() > 0 && s.peek() > arr[i]) {
                ans[i] = s.peek();
            } else {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    ans[i] = -1;
                } else
                    ans[i] = s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}