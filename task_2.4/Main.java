/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. 
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("--------------------------------------------");
        System.out.println("Pacчет всклада с рефинансированием процентов");
        System.out.println("Введите сумму вклада");
        double deposit  = scanner.nextDouble(); 
        System.out.println("Введите процент");
        double rate     = scanner.nextDouble(); 
        scanner.close();

        // Calculate & print result
        rate = rate/100;
        for(int i=1; i<=5; i++){
            double interest = deposit*rate;
            deposit += interest;
            System.out.printf("year %d. Deposit: %.2f interest: %.2f\n",i,deposit,interest); 
        }

    }
}
