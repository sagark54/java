public class selectionsort {
    public static void main(String[] args) {
        int temp;
        int[] arr = new int[] { 5, 4, 7, 3, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

}
