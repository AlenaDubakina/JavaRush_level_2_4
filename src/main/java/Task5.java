import java.util.Scanner;

public class Task5 {
    // Три числа
    // Ввести с клавиатуры три целых числа.
    // Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
    // Если такая пара существует, вывести на экран числа через пробел.
    // Если все три числа равны между собой, то вывести все три.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        if (num1 == num2 && num2 == num3)
            System.out.println(num1 + " " + num2 + " " + num3);
        else if (num1 == num2)
            System.out.println(num1 + " " + num2);
        else if (num1 == num3)
            System.out.println(num1 + " " + num3);
        else if (num2 == num3)
            System.out.println(num2 + " " + num3);
    }
}