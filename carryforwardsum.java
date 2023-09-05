public class carryforwardsum {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 9, 9, 9, 9, 9, 9, 9 };
        int[] arr2 = new int[] { 9, 9, 9, 9, 9, 9, 9 };
        int[] ans = new int[7];
        int carry = 0;
        for (int i = arr1.length - 1; i > 0; i--) {
            ans[i] = arr1[i] + arr2[i] + carry;
            carry = ans[i] / 10;
            ans[i] = ans[i] % 10;
        }
        ans[0] = arr1[0] + arr2[0] + carry;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
