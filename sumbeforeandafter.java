public class sumbeforeandafter {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 4, 5, 9, 7, 3, 2, 1 };
        int[] arr2 = new int[7];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }

        int prevsum = 0;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("previous sum is " + prevsum);
            prevsum = prevsum + arr1[i];
            sum = sum - arr1[i];
            System.out.println("after sum is " + sum);
        }

    }
}
