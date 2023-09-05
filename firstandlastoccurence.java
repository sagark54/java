public class firstandlastoccurence {
    public static void main(String[] args) {
        int nums[] = new int[] { 5, 7, 7, 7, 8, 8, 10 };
        int low = 0, high = (nums.length) - 1;
        int ans = -1;
        int target = 7;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                ans = mid;
                high = mid - 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(+ans);
        low = 0;
        high = (nums.length) - 1;
        int ans2 = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                ans2 = mid;
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(+ans2);
    }
}
