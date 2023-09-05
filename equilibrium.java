public class equilibrium {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 3, 2, 1, 9, 3, 2, 1 };
        int[] arr2 = new int[7];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }

        int prevsum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum = sum - arr1[i];
            if (prevsum == sum) {
                System.out.println("Equillibrium point is : " + arr1[i]);
            }
            prevsum = prevsum + arr1[i];

        }

    }

}
