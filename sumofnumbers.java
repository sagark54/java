public class sumofnumbers {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[5];
        int sum = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {
            sum = sum + arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sum - arr1[i];
            System.out.println(arr2[i]);
        }

    }
}
