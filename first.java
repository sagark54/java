public class first {
    public static void main(String args[]) {

        int arr[] = new int[] { 1, 1, 1, 2, 2, 2, 3, 5, 6 };
        int key = 2;
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                ans = mid;
                high = mid - 1;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
