/*
Задание: Дан массив с числами. 
Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};

        print(num, 0);
        System.out.println();    
    }

    public static void print(int[] array, int index){
        if(index >= array.length) return;

        // Print current
        System.out.printf("%d ", array[index]);    

        // Reccurent call
        print(array, index+1);
    }
}
