public class Task8 {
    // Незаполненный прямоугольник
    // Используя вложенные циклы while (цикл в цикле) выведи на экран
    // незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
    // Незаполненная часть состоит из пробелов.

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int n = 0;
            if (i == 0 || i == 9) {
                while (n < 20) {
                    System.out.print("Б");
                    n++;
                }
            } else {
                while (n < 20) {
                    if (n == 0 || n == 19) {
                        System.out.print("Б");
                        n++;
                    }
                    System.out.print(" ");
                    n++;
                }
            }
            System.out.println();
            i++;
        }
    }
}