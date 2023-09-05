import java.util.Scanner;

public class FC {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = 2;
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }

        System.out.println("last occcuence of given number is :" + ans);
    }
}
