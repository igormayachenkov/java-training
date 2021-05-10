/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> map = new HashMap<>();
        while (true) {
            // Input 
            System.out.println("Введите фамилию");
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }
            System.out.println("Введите город");
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            // Add to the map
            map.put(city, family);
        }
        System.out.println("-------------------------------");


        // Read the city name
        System.out.println("Введите город чтобы узнать, кто там живет:");
        String city = scanner.nextLine();
        // Print family for the city
        if (map.containsKey(city)) {
             String familyName = map.get(city);
             System.out.println(familyName);
        }
    }
}
