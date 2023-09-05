public class palin {
    public static void main(String args[]) {
        String str = "king";
        int low = 0;
        int high = str.length() - 1;
        int flag = 0;
        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                System.out.println("Given string is not palindrome");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("given string is palindrome");
    }
}
