package Lesson16;
//Написать код, который выбрасывает NullPointerException.
// Написать обработчик этого исключения и вывести на экран сообщение,
// которое будет содержать описание данного исключения.

public class Error {


    public static void main(String[] args) {
        Error error= null;
        try {
            error.equals("Hello");

        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
