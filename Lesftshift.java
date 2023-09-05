public class Lesftshift {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 6, 3, 4, 9 };
        int temp = 9;
        int k = 5, j;
        while (k > 0) {
            temp = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
            k--;
            System.out.println(arr[j]);
        }
    }
}
