/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String[] words = {"Мама", "Мыла", "Раму"};
        //String[] words = {"1", "2", "3"};
        //printCnk(words, 0);

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                for(int k=0; k<words.length; k++){
                    if(i!=j && i!=k && j!=k)
                        System.out.printf("%s%s%s\n",words[i],words[j],words[k]);
                }
            }
        }
    }
    // static void printCnk(String[] words, int index){

    // }
}
