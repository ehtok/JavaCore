package Lesson16;

public class Error2 {
    double error(int a, int b) {
        double res;
        res = a / b;
        return res;
    }

    public static void main(String[] args) {
        Error2 error2 = new Error2();

        try {
            error2.error(2, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
