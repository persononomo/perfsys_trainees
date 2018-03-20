//Задача 9 «Нечетные числа»
//Заполнить массив из n элементов случайными целыми числами в диапазоне [10; 50]. Определить, в какой половине массива больше четных чисел: в первой или второй.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Random;

public class ArraysTask9 {
    public static void main(String[] args) {
        int n = 12;
        int[] array = new int[n];
        int[] array2 = new int[array.length];
        int counterOfChetnii = 0;
        int counterOfChetnii2 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random()).ints(10, 50).iterator().nextInt();

            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int j = 0; j < array.length / 2; j++) {
            if (array[j] % 2 == 0) counterOfChetnii++;
        }

        for (int j = 0; j < array.length; j++) {
            array2[j] = array[array.length - j - 1];
        }
        for (int i = 0; i < array2.length / 2; i++) {
            if (array2[i] % 2 == 0) counterOfChetnii2++;
        }

        if (counterOfChetnii > counterOfChetnii2) System.out.println("В первой половине массива больше четных чисел");
        if (counterOfChetnii < counterOfChetnii2) System.out.println("Во воторой половине массива больше четных чисел");
        else System.out.println("В двух половинах массива равное количество четных чисел");
    }

}

