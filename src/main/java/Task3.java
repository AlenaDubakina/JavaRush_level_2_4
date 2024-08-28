import java.util.Scanner;

public class Task3 {
    // Чтение и преобразование строк
    // Считай с клавиатуры три строки. А затем:
    // Выведи на экран третью строку в неизменном виде.
    // Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
    // Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s1 = console.nextLine();
        String s2 = console.nextLine();
        String s3 = console.nextLine();
        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}