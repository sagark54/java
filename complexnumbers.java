class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    void print() {
        // x=2+5i
        System.out.println(real + " + " + imaginary + " i");
    }
}

class main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2, 3);
        x.print();
        ComplexNumber y = new ComplexNumber(-5, 4);
        y.print();
    }
}