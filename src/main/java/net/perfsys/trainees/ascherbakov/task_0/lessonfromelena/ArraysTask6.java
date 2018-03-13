//Получить случайным образом массив из 15 оценок. Определить:
//–	средний балл в группе и количество учеников, оценки которых выше среднего,
//–	максимальный балл,
//–	номера учеников с максимальной оценкой (номера вывести на форму в элемент управления ListBox),
//–	две (три) самые низкие оценки (по значению).

package net.perfsys.trainees.ascherbakov.task_0;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class ArraysTask6 {
    public static void main(String[] args) {
        int n = 15;
        int sredniibal = 0;
        int kolvoBotanov = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).ints(1, 12).iterator().nextInt();
            sredniibal += array[i];
        }
        sredniibal /= n;
        for (int num : array) {
            if (num > sredniibal) kolvoBotanov++;
        }
        System.out.println("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();

        System.out.println("Средний бал в группе: " + sredniibal);
        for (int i = 1; i < array[i]; i++) {
            if (i > sredniibal) kolvoBotanov++;
        }
        System.out.println("Количество учеников у которых бал выше среднего: " + kolvoBotanov);
        OptionalInt max = Arrays.stream(array).max();
        System.out.println("Максимальный бал: " + max.getAsInt());
        Arrays.sort(array);
        System.out.println("Три самые низкие оцени: " + array[0] + " " + array[1] + " " + array[2]);

    }
}
