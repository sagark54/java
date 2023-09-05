public class binarysearch {
    public static void main(String[] args) {
        int key = 30;
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

}
