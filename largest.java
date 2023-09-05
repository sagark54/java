public class largest {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 6, 3, 4, 9, 100 };
        int i;
        int max = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is :" + max);
    }
}
