public class Run {
    public static void main(String args[]) {
        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(2);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(2);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}
