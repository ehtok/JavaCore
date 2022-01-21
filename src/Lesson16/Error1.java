package Lesson16;

public class Error1 {
    public static void main(String[] args) {
        Error1 error1[] = new Error1[10];
        try {
            System.out.println(error1[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }finally {
            System.out.println("Finally message");
        }
    }
}
