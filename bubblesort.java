public class bubblesort {
    public static void main(String[] args) {
        int temp;
        int[] arr = new int[] { 100, 90, 80, 70, 50 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
    }
}