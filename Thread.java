class A extends Thread {
    public A(Runnable obj1) {
        super(obj1);
        // TODO Auto-generated constructor stub
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(2);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
    }
}

class B extends Thread {
    public B(Runnable obj1) {
        super(obj1);
        // TODO Auto-generated constructor stub
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
    }
}

public class Thread {
    public Thread(Runnable obj1) {
    }

    public static void main(String[] args) {
        A obj1 = new A(null);
        B obj2 = new B();
        obj1.run();
        try {
            Thread.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        obj2.run();
    }

    public static void sleep(int i) {
    }

    public void start() {
    }

}
