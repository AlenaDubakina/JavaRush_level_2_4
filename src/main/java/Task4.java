import java.util.Scanner;

public class Task4 {
    // Призывная кампания
    // Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
    // то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        if (age >= 18 && age <= 28)
            System.out.println(name + militaryCommissar);
    }
}