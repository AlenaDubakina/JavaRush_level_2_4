import java.util.Scanner;

public class Task9 {
    // Второе минимальное число из введенных
    // 1. Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
    // например, строка или символ. Должно быть введено минимум два числа.
    // Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно,
    // а программа может быть завершена с ошибкой.
    // 2. Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
    // Если таких чисел несколько, то необходимо вывести любое из них.
    // Минимальных чисел тоже может быть несколько.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int num1 = console.nextInt();
            if (num1 < min1 && num1 != min2) {
                if (min1 < min2)
                    min2 = num1;
                else
                    min1 = num1;
            } else if (num1 < min2 && num1 != min1)
                min2 = num1;
        }
        int min = min1 > min2 ? min1 : min2;
        System.out.print(min);
    }
}