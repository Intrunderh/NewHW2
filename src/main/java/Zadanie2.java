public class Zadanie2 {
    public static void main(String[] args) {
        // Напишите программу, которая выводит все числа от 1 до 10, кроме числа 5.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
