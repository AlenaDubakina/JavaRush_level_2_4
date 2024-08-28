import java.util.Scanner;

public class Task7 {
    // Суммирование
    // Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
    // пока пользователь не введет слово "ENTER". Вывести на экран полученную сумму и завершить программу.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);
    }
}