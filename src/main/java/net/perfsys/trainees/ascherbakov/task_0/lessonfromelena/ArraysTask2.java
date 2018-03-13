//Задача 2 «Симметрия»
//Заполнить первую половину массива, состоящего из n элементов случайными числами в диапазоне [20;100]. Вторую половину массива получить как зеркальное отражение первой половины массива.
//Например, элементы массива A (четное количество): 31, 62, 99, 46, 77, 77, 46, 99, 62, 31
//Например, элементы массива A (нечетное количество): 31, 62, 99, 46, 77, 46, 99, 62, 31

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Random;

public class ArraysTask2 {
    public static void main(String[] args) {
        int n = 12;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).ints(20, 100).iterator().nextInt();
            array[n - 1 - i] = array[i];

        }
        for (int num : array) {
            System.out.print(num + "\t");
        }
    }

}
