import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        // со сканера вводится число задача показать
        // (продублировать) на экране только те числа которые 2значные
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите числа (чтобы выйти введите 0):");
        while(true)
        {
            int chisla = scanner.nextInt();
            if (chisla >= 10 && chisla < 100){
                System.out.println(chisla);
            }
            if (chisla == 0){
                System.out.println("Вы ввели цифру 0. Процесс завершен");
                break;
            }
        }

    }
}
