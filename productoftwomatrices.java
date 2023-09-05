public class productoftwomatrices {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                int sum = a[i][j] + b[i][j];
                System.out.print(sum + " ");
            }
            System.out.println("");
        }
    }

}
