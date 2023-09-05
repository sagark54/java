public class basicstrings {
    public class Main {
        static int square(int num) {
            return num * num;
        }

        static void hello() {
            System.out.println("hello world");
        }

        static String[] heroes() {
            String[] superheroes = { "Ironman", "batman", "captain america" };
            return superheroes;
        }

        public static void main(String[] args) {
            // System.out.println(square(10));
            // System.out.println(square(8));
            // hello();
            String[] arr = heroes();
            for (String hero : arr) {
                System.out.println(hero);
            }
        }
    }
}
