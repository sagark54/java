public class rotatedsortedarray {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        int low = 0, high = nums.length - 1;
        int target = 4;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                // return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[nums.length - 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                    System.out.println("Not found");
                }
            }
        }
    }
}