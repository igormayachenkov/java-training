/*
Задание: Дано число, например 31. 
Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. 
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. 
Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("--------------------------------------------");
        System.out.println("Проверка простых чисел");
        System.out.println("Введите целое положительное число большее 1");
        int n  = scanner.nextInt(); 
        scanner.close();

        // Calculation
        for(int i=2; i<n; i++){
            int d = n % i;
            if(d==0){
                System.out.printf("Это составное число, оно делится на : %d\n", i);
                return;
            }
        }

        // Success Output
        System.out.println("Это простое число!\n");

    }
}
