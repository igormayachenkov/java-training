  
/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Read filename
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String filename = scanner.nextLine();
        scanner.close();

        // Read data from file
        ArrayList<Integer> src = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                Integer line = reader.nextInt();
                src.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Do filter
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer item : src) {
            if(item%2==0)
                res.add(item);
        };
        Collections.sort(res);

        // Print result
        System.out.println("source : "+src);
        System.out.println("result : "+res);

    }
}
