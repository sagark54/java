import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String rev = sb.toString();
        if (str.equals(rev)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

}
