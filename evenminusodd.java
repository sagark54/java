public class evenminusodd {
    public static void main(String[] args) {
        int[] arr = new int[] { 56, 63, 87, 24, 32, 13, 15, 19, 44, 52 };
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 = sum1 + arr[i];
            } else {
                sum2 = sum2 + arr[i];
            }
        }
        int result = sum1 - sum2;
        System.out.println(result);

    }

}
