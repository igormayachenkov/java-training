/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Initialization
        List<Integer> src = new ArrayList<>(
            List.of(15, 35, 0, 3, -18, 10, 5) 
        );

        // Do action
        List<Integer> res = new ArrayList<>();
        for (Integer item : src) {
            if(item>0 && item<10)
                res.add(item);
        };

        // Print result
        System.out.println("source : " + src);
        System.out.println("result : " + res);
    }
}
