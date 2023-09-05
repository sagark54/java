public class sqrt {
    public static void main(String[] args) {
        int x = 10;
        int low = 0, high = x;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Square root of  number is " + ans);
    }

}
