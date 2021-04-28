/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. 
Если это так - выведите 'Делится' и результат деления, 
иначе выведите 'Делится с остатком' и остаток от деления.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("--------------------------------------------");
        System.out.println("Деление с остатком");
        System.out.println("Введите целое число a");
        int a  = scanner.nextInt(); 
        System.out.println("Введите целое число b");
        int b  = scanner.nextInt(); 
        scanner.close();

        // Calculation
        int c = a / b;
        int d = a % b;

        // Output
        if(d==0) 
            System.out.printf("Делится: %d\n", c);
        else
            System.out.printf("Делится с остатком: %d (остаток %d)\n", c, d);

    }
}
