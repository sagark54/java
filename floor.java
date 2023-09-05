public class floor {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 4, 5, 7, 9, 10 };
        int low = 0, high = arr.length - 1;
        int ans = arr.length - 1;
        int target = 4;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Floor of target number is " + ans);

    }
}
