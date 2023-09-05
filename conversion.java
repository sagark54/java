public class conversion {
    public static void main(String args[]) {
        int arr[] = new int[10];
        int i = 1;
        int n = 5;
        while (n != 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = arr.length - 1; j > 0; j--) {
            System.out.print(arr[j]);
        }

    }

}
