import java.util.Scanner;

public class Task6 {
    // Tреугольник
    // Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
    // Для этого тебе нужно:
    // Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
    // Определить возможность существования треугольника по сторонам.
    // Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (a < (b + c) && b < (a + c) && c < (a + b))
            System.out.println(TRIANGLE_EXISTS);
        else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}