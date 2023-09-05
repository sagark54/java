import java.util.Scanner;

public class power {
    public static void main(String args[]) {

        double power;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        power = Math.pow(x, n);
        System.out.println(power);
    }

}
