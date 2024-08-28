import java.util.Scanner;

public class Task10 {
    // Сумма кратных чисел
    // В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
    // Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
    // кратных multiple. Для этого используй цикл for.
    // Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;
        for (; start < end; start++) {
            if (!(start % multiple == 0))
                continue;
            sum += start;
        }
        System.out.println(sum);
    }
}
