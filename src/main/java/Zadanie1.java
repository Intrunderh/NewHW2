import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        // Напишите программу, которая запрашивает у пользователя числа
        // до тех пор, пока он не введет число 0. После ввода числа 0
        // программа должна вывести сумму всех введенных чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа:");
        int sum = 0;
        while(true)
        {
            int chisla = scanner.nextInt();
            sum = sum + chisla;
            if (chisla == 0){
                break;
            }
        }
        System.out.println("Вы ввели цифру 0. Сумма всех введенных чисел = " + sum);
    }
}
