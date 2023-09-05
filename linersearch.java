public class linersearch {
    public static void main(String[] args) {
        int key = 40;
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
            }
        }
    }
}